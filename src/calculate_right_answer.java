public class calculate_right_answer {
        public static void main(String[] args) {
            char[][] student_answer={
                    {'A','B','A','C','C','D','E','E','A','D'},
                    {'D','B','A','B','C','A','E','E','A','D'},
                    {'E','D','D','A','C','D','E','E','A','D'},
                    {'A','B','A','C','C','D','E','E','A','D'},
                    {'A','B','A','C','C','D','E','E','A','D'},
                    {'A','B','A','C','C','D','E','E','A','D'},
                    {'A','B','A','C','C','D','E','E','A','D'},
                    {'A','B','A','C','C','D','E','E','A','D'}
            };
            char[] right_answer={'D','B','D','C','C','D','A','E','A','D'};
            int[] score=new int[8];
            for(int i=0;i<8;i++)
            {
                int total_score=0;
                for(int j=0;j<10;j++)
                {
                    if(student_answer[i][j]==right_answer[j])
                    {
                        total_score++;
                    }
                }
                score[i]=total_score;
            }
            for(int i=0;i<8;i++)
                System.out.print(score[i]+" ");
        }
    }
