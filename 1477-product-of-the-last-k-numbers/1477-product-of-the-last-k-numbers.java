class ProductOfNumbers {
    int[] arr;
    int i;
    int last_zero = -1;
    public ProductOfNumbers() {
        arr = new int[40001];
        i=0;
    }
    
    public void add(int num) {
        if(i== 0){
            arr[i] = num;
        }
        else{
            if(arr[i-1] == 0){
                arr[i] = num;
            }else{
                arr[i] = arr[i-1]*num;
            }
        }
            if(num==0){
                last_zero = i;
            }
        i++;
    }
    
    public int getProduct(int k) {
        if(i-k <= last_zero ) return 0;
        if(i-k==0) return arr[i-1];
        if(arr[i-1-k] == 0) return arr[i-1];
        return arr[i-1]/arr[i-k-1];
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */