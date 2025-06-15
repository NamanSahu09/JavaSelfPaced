import java.util.*;
public class AsteroidCollision 
{
  
    public int[] asteroidCollision(int[] asteroids) 
    {
          Deque<Integer> st = new ArrayDeque<>();
          for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            if (curr > 0) 
            {
                st.push(curr);
            } 
            
            else 
            {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(curr)) 
                {
                    st.pop(); // smaller positive asteroid destroyed
                }

                if (!st.isEmpty() && st.peek() == Math.abs(curr)) 
                {
                    st.pop(); // both destroy
                } else if (st.isEmpty() || st.peek() < 0) 
                {
                    st.push(curr); // no collision or previous negative
                }
            }
        }

        //stack to array 
        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) 
        {
            res[i] = st.pop();
        }

        return res;
    }
    public static void main(String args[])
    {
        AsteroidCollision ac = new AsteroidCollision();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of asteroids:");
        int n = sc.nextInt();
        int[] asteroids = new int[n];
        System.out.println("Enter the asteroids (positive for right, negative for left):");
        for (int i = 0; i < n; i++) {
            asteroids[i] = sc.nextInt();
        }
        int[] result = ac.asteroidCollision(asteroids);
        System.out.println("Resulting asteroids after collisions: " + Arrays.toString(result));
    }

}


