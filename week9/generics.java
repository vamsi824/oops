class BubbleSort<T extends Comparable <T>>{
    void bubbleSort(T[] data){
        for(int i = 0; i < data.length; i++){
            for(int j = 1; j < data.length; j++){
                if(data[j-1].compareTo(data[j])>0){
                    T temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args){
        BubbleSort<Integer> obj = new BubbleSort<>();
        Integer data[] = {1,2,3,4,5};
        obj.bubbleSort(data);
        BubbleSort<String> obj1 = new BubbleSort<>();
        String data1[] = {"jada","vamsi"};
        obj1.bubbleSort(data1);
        BubbleSort<Double> obj2 = new BubbleSort<>();
        Double data2[] = {3.61,5.94,5.87};
        obj2.bubbleSort(data2);
    }
}
