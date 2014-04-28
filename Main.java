public class Main {

    String ch ;
    int  x ;

    public void affiche(){
        System.out.println("ch="+ch);
		System.out.println("x="+x);
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public void setX(int x) {
        this.x = x;
    }
	public Main(String c,int t)
	{
	ch=c;
	x=t;
	}
}
