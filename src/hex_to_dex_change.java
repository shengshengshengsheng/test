import java.util.Scanner;
/**
 * 十六进制转换为十进制
 * */
public class hex_to_dex_change {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String hex=input.next();
        hex=hex.toLowerCase();
        int dex=0;
        for(int i=0;i<hex.length();i++)
        {
            int now=0;
            char s=hex.charAt(i);
            if(s>='a'&&s<='z')
            {
                now=s-'a'+10;
            }
            else
            {
                now=s-'0';
            }
            dex=dex*16+now;
        }
        System.out.println(hex+"的十进制形式为："+dex);
    }
}
