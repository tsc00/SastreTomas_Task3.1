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
            i++;
        }


    }
}