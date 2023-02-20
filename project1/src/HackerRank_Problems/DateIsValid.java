package HackerRank_Problems;

public class DateIsValid {

    public static boolean isValid(int dd,int mm, int yy){

        if(yy<=0){
            return false;
        }
        if(mm>12 || mm<0){
            return false;
        }
        if(mm == 1 || mm==3 || mm ==5 || mm ==7 || mm==8 || mm==10 || mm==12){
            if(dd> 31 || dd <= 0){
                return false;
            }
        }else if(mm == 4 || mm==6 || mm ==9 || mm ==11){
            if(dd>30 || dd<=0){
                return false;
            }
        }else if(mm==2){
            if(yy%4 == 0){
                if(dd>29 || dd<=0){
                    return false;
                }
            }else if(yy%4!=0){
                if(dd>28 || dd<=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int dd = 32;
        int mm = 3;
        int yy = 2021;
        System.out.println(isValid(dd,mm,yy));
    }
}
