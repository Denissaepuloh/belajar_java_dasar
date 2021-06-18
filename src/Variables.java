public class Variables {
    public static void main(String[] args) {

        // Variabel String
        String name = "Denis Saepuloh";
        System.out.println(name);

        // Variable Integer
        int myNum = 15;
        System.out.println(myNum);

        // Variabel Interger cara ke 2
        int age;
        age = 23;
        System.out.println(age);

        // Memberikan Value baru pada value yang sebelumnya di Integer
        int Dollar = 15;
        Dollar = 23; // Ini Adalah Value Baru
        System.out.println(Dollar);

        // Variabel Final
        final int Final = 18;
        /* final  = 20; memberikan nilai baru di type data final akan menyebabkan error */

        // Tipe - Tipe Variables
        int myNumb = 15;
        float myFloatNumb = 5.99F;
        char myCharacter = 'A';
        boolean myBoolean = true;
        String myText = "Hello World";
        System.out.println(myNumb);
        System.out.println(myFloatNumb);
        System.out.println(myCharacter);
        System.out.println(myBoolean);
        System.out.println(myText);

        // Variabel Tampilan
        String nama = "Denis Saepuloh";
        System.out.println("Hello" + " " + /* memberikan jarak menggunakan spasi */ nama);

        // menggabungkan atau menambahkan variabel menggunakan karakter (+)
        String firstName = "Denis";
        String lastName = "Saepuloh";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // memberikan operator matematika (+)

        // Memberikan banyak variabel
        int a = 5, b = 6, c = 7;
        System.out.println(a + b + c);

        // Penulisan Variabel
        int minutePerHour = 60; // penulisan yang Baik
        int m = 60; // penulisan kurang baik karena sulit untuk dipahami
    }
}
