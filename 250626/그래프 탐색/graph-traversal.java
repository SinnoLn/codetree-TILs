import java.util.*;
import java.io.*;

public class Main {
    static int n,m,cnt;
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        visited = new boolean[n+1];
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(a).add(b);
            list.get(b).add(a);

        }

        dfs(1);
        System.out.println(cnt-1);
    }

    static void dfs(int node){
        visited[node] = true;
        cnt++;
        for(int next : list.get(node)){
            if(!visited[next]) dfs(next);
        }
    }
}