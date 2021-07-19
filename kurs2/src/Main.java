public class Main {
    byte b = 127; // byte = -128 -> 127
    short s = 32767; //short -32768 -> 32767
    int i = -2147483648; //int -2147483648 -> 2147483647
    char c = 'a';
    String string = "w nawiasach znajduje sie tekst";
    public static void main(String[] args){
        //int[] wynik = new int[4];
        float wynik1, wynik2, wynik3, wynik4, wynik5;
        int n = 5;
        float l1 = 56;
        float l2 = 16;
        wynik1 = l1+l2;
        wynik2 = l1-l2;
        wynik3 = l1*l2;
        wynik4 = l1/l2;
        wynik5 = l1%l2;
        float[] wynik = {wynik1, wynik2, wynik3, wynik4, wynik5};
        for(int i=0; i<n; i++) {
            System.out.println("Wynik" + i + " = " + wynik[i]);
        }
    }
}
