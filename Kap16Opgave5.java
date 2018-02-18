public class Kap16Opgave5 {
    public static void main(String[] args) {
        LinkedIntList B = new LinkedIntList();

        B.add(0,1);
        B.add(1);
        B.add(1);
        B.add(3);
        B.add(3);
        B.add(6);
        B.add(9);
        B.add(15);
        B.add(15);
        B.add(23);
        B.add(23);
        B.add(23);
        B.add(40);
        B.add(40);

        countDuplicates(B);
    }


    // kapitel 16 opgave 5

    public static int countDuplicates(LinkedIntList list) {
        LinkedIntList C = new LinkedIntList();
        int duplicates = 0;
        int K = 0;
        while (C.size() < list.size()) {
            {
                if (!C.contains(list.get(K))) {
                    C.add(list.get(K));
                } else {
                    C.add(list.get(K));
                    duplicates++;
                }
                K++;
            }
        }
        System.out.println(duplicates);
        return duplicates;
    }

}
