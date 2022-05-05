public class btreearray {
    public static void main(String[] args) {
        array_imp oj = new array_imp();
        oj.root("A"); // setting root node
        //oj.setleft("b",0);
        oj.setright("c",0);
        oj.setleft("d",1);
        oj.setright("e",1);
        oj.setleft("f",2);
        oj.printtree();
    }
}
class array_imp
{
    // member variables
    static int root=0;
    static String[] str = new String[10];
    public void root(String key)
    {
        str[0]=key;
    }
    public void setleft(String key, int root)
    {
        int t = (root*2)+1;
        if(str[root] == null)
        {
            System.out.printf("can't set child at %d, as no parent found",t);
        }
        else
        {
            str[t]=key;
        }
    }
    public void setright(String key, int root)
    {
        int t = (root*2)+2;
        if(str[root]==null)
        {
            System.out.printf("can't set child node at %d, as no parent found",t);
        }
        else
        {
            str[t]=key;
        }
    }
    public void printtree()
    {
        System.out.println("");
        for(int i=0;i<10;i++)
        {
            if(str[i]!=null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}
