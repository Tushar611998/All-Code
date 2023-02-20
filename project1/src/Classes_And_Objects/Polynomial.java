package Classes_And_Objects;

public class Polynomial {
    private int coeff;
    private int degree;
    private int DArray[];
    public Polynomial() {
        DArray = new int[5];

        this.coeff = 0;
        this.degree = 0;
    }

    public void setCoefficient(int degree, int coeff) {
        this.degree = degree;
        this.coeff = coeff;

        if (degree < this.DArray.length) {
            this.DArray[degree] = coeff;
        }
        else if(degree>= DArray.length) {
            while(degree>=DArray.length) {
                restructure();
            }
            this.DArray[degree] = coeff;

        }
    }

    public int getcoeff(int degree) {
        int x;
        if(degree<DArray.length) {
             x = this.DArray[degree];
            return x;
        }
        else{
            restructure();
            x = this.DArray[degree];
        }
        return x;
    }

    public Polynomial add(Polynomial second){

        Polynomial result = new Polynomial();
        int p1 = this.DArray.length;
        int p2 = second.DArray.length;
        int i;

        int smallest = Math.min(p1,p2);
        for(i=0;i<smallest;i++){
            result.setCoefficient(i,this.DArray[i]+second.DArray[i]);
        }
        while(i<p1){
            result.setCoefficient(i,this.DArray[i]);
            i++;
        }
        while(i<p2){
            result.setCoefficient(i,second.DArray[i]);
            i++;
        }

        return result;
    }

    public Polynomial substract(Polynomial second){
        Polynomial result = new Polynomial();
        int p1 = this.DArray.length;
        int p2 = second.DArray.length;
        int smallest = Math.min(this.DArray.length,second.DArray.length);
        int i ;
        for( i =0;i<smallest;i++){
            result.setCoefficient(i, this.DArray[i]-second.DArray[i]);
        }

        while(i< p1){
            result.setCoefficient(i,this.DArray[i]);
                i++;
        }
        while(i<p2){
            result.setCoefficient(i,-second.DArray[i]);
            i++;
        }
        return result;
    }
    public Polynomial multiply(Polynomial second){
        Polynomial result = new Polynomial();
        int p1 = this.DArray.length;
        int p2 = second.DArray.length;
        for(int i =0;i<p1;i++){
            for (int j =0;j<p2;j++){

                int tempdegree= i+j;
                int tempcoeff = DArray[i] * second.DArray[j];
                int oldcoeff = result.getcoeff(tempdegree);

                result.setCoefficient(tempdegree,tempcoeff + oldcoeff);

            }
        }
        return result;
    }

    private void restructure() {

        int arr[] = this.DArray;
        DArray = new int[this.DArray.length * 2];
        for (int i = 0; i < arr.length; i++) {
            DArray[i] = arr[i];
        }
    }

    public void print(){
        for (int i =0;i<this.DArray.length;i++){
            int index = i;
            if(this.DArray[i]==0){
                continue;
            }
            else{
                System.out.print(this.DArray[i]+"x"+i+" + ");
            }

        }
        System.out.println();
    }

}
