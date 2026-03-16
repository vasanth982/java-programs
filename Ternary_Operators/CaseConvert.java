class CaseConvert {
    public static void main(String[] args) {

        char ch = 'A';

        char result = (ch >= 'A' && ch <= 'Z') ?
                      (char)(ch + 32) : ch;

        System.out.println(result);
    }
}