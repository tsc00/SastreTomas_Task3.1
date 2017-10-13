public class Nprimos {
    public static void main(String[] args) {
        int i = 1;
        boolean primo;
        while (i<=10000){
            primo = true;
            for(int z =i-1;z >=2; z--){

                if (i%z ==0){
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i);

            }
            if  (i % 1000 == 0){
                System.out.println("|---------------------------|");
            }
            i++;
        }

    }
}
/*
Tomás Sastre Cámara
2n ASIX Web Applications Implementation
 */