package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("not found element: " + key);
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        boolean rsl = false;
        for (int i = 0; i < abuses.length; i++) {
            if (abuses[i].equals(value)) {
                return true;
            }
        }
        if (!rsl) {
            throw new ElementAbuseException("That word is banned");
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void main(String[] args) throws ElementNotFoundException {
        try {
            indexOf(new String[]{"0", "qweqe", "qwe"}, "1");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
