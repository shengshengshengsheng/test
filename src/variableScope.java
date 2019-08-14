public class variableScope {
        /**
         * 测试变量的作用域
         * */
        private static int i=0;
        private static int j=0;
        public static void main(String[] args) {
            int i=2;
            int k=3;
            {
                int j=3;
                System.out.println("i="+i);//输出i=2
                System.out.println("j="+j);//输出j=3
            }
            k=i+j;
            System.out.println("k="+k);//输出k=2
            System.out.println("i="+i);//输出i=2
            System.out.println("j="+j);//输出j=0
        }
}
