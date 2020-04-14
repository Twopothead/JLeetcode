import java.util.List;
//Suppose you have a long flowerbed in which some of the plots are planted 
// and some are not. However, flowers cannot be planted
// in adjacent plots - they would compete for water 
// and both would die.
//Given a flowerbed (represented as an array containing 0 and 1, 
// where 0 means empty and 1 means not empty), and a number n, 
//return if n new flowers can be planted in it without violating 
// the no-adjacent-flowers rule.
public class S605_can_place_flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        return false;
    }
    public void testcase() {
//Example 1:
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: True
//Example 2:
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: False
    	int[] flowerbed1 = {1,0,0,0,1};
    	int[] flowerbed2 = {1,0,0,0,1};
    	int n1 = 1,n2 = 2;
    	System.out.println(canPlaceFlowers(flowerbed1, n1));
    	System.out.println(canPlaceFlowers(flowerbed2, n2));
	}
    public static void main(String[] args) {
    	S605_can_place_flowers s = new S605_can_place_flowers();
    	s.testcase();
	}
}
