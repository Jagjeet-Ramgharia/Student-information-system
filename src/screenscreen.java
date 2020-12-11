


public class screenscreen {
    public static void main(String args[]){
        splashscreen1 ss = new splashscreen1();
        ss.setVisible(true);
        LoginForm lf = new LoginForm();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                
                ss.loadingbar.setValue(i);
               if(i==100){
                   ss.setVisible(false);
                   lf.setVisible(true);
               }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
