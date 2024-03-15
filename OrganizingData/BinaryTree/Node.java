public class Node {
   private int num;
   private int leftChildNum;
   private int rightChildNum;
   
   public Node(int num,int leftChildNum,int rightChildNum) {
      this.num = num;
      this.leftChildNum = leftChildNum;
      this.rightChildNum = rightChildNum;
   }
   
   public int getNum() {
      return num;
   }
   
   public int getLeftChildNum() {
      return leftChildNum;
   }
   
   public int getRightChildNum() {
      return rightChildNum;
   }
   
   public void setNum(int num) {
      this.num = num;
   }
   
   public void setLeftChildNum(int leftChildNum) {
      this.leftChildNum = leftChildNum;
   }
   
   public void setRightChildNum(int rightChildNum) {
      this.rightChildNum = rightChildNum;
   }
}