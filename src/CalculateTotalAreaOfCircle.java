public class CalculateTotalAreaOfCircle {
        public static void main(String[] args) {
            CircleWithPrivateDataField[] circleArray=createCircleArray();
            printCircleArray(circleArray);
        }
        private static void printCircleArray(CircleWithPrivateDataField[] circleArray) {
            double total_area=0;
            System.out.printf("%-30s%-15s\n","Radious","Area");
            for(int i=0;i<circleArray.length;i++)
            {
                System.out.printf("%-30s%-15s\n",circleArray[i].getRadious(),circleArray[i].getArea());
                total_area+=circleArray[i].getArea();
            }
            System.out.printf("--------------------------------------\n");
            System.out.printf("the total area of the circles is:"+total_area);
        }

        private static CircleWithPrivateDataField[] createCircleArray() {
            CircleWithPrivateDataField[] circleArray=new CircleWithPrivateDataField[5];
            for(int i=0;i<circleArray.length;i++)
            {
                circleArray[i]=new CircleWithPrivateDataField(Math.random()*100);
            }
            return circleArray;
        }
        public static class CircleWithPrivateDataField {
            private double radious;
            private double PI=3.14159265358;
            CircleWithPrivateDataField()
            {
                this.radious=Math.random()*100;
            }
            CircleWithPrivateDataField(double radious)
            {
                this.radious=radious;
            }
            public void setRadious(double radious)
            {
                this.radious=radious;
            }
            public double getRadious()
            {
                return radious;
            }
            public double getArea()
            {
                return PI*radious*radious;
            }
        }
    }
