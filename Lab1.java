public class Lab1{
    public static void main(String[] args){
        int[] c = new int[13]; //создаем одномерный массив c
        int starting_point=3; //назначаем переменной начальное число массива
        for ( int i = 0; i < c.length; i++){ // с помощью цикла for последовательно назначаем элементы массива
            c[i]=starting_point;
            starting_point+=1;
        }
        float[] x = new float[15];//создаем массив x типа float
        final float start=(float) -6.0; // задаем минимально и максимально допустимые значения массива
        final float end=(float) -10.0;
        for (int i = 0; i < x.length; i++){
            x[i] = (float) (Math.random() * (end - start)) + start;
        }
        double[][] main_array = new double [13][15];//создаем двумерный массив типа double
        for (int i = 0; i < 13; i++ ) { // ... и заполняем его значениями в соответствии с заданием
            for (int j=0; j < 15; j++) {
                switch (c[i]){
                case 13:
                    main_array[i][j] = 2 /Math.log(Math.acos((x[j]+2)/16));
                    break;
                case 3,4,5,8,9,12:
                    main_array[i][j] = Math.pow((2 * Math.sin(Math.pow(((x[j]-1)/0.25),3))),2);
                    break;
                default:
                    main_array[i][j] = ((double) 1/2) / (Math.tan(Math.tan(Math.pow(Math.E, x[j]))) + ((double) 2 / 3));
                    break;
                }
              

            }
        }
        for (int i = 0;i < 13; i++ ){ //выводим значения массива в формате 4 знаков после запятой
            for (int j = 0; j < 15;j++){
                System.out.printf("%.4f"+"  ",main_array[i][j]);
            }
            System.out.println();
        }
    }
}