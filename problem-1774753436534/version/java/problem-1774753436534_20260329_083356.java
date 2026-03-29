// Last updated: 3/29/2026, 8:33:56 AM
1class EventManager {
2    private PriorityQueue<int[]> pq;
3    private Map<Integer, Integer> map;
4
5    public EventManager(int[][] events) {
6         map = new HashMap<>();
7        pq = new PriorityQueue<>((a, b) -> {
8            if (b[0] != a[0]) return b[0] - a[0];
9            return a[1] - b[1];                     
10        });
11        for (int[] e : events) {
12            int id = e[0];
13            int priority = e[1];
14            map.put(id, priority);
15            pq.offer(new int[]{priority, id});
16        }
17    
18    }
19    
20    public void updatePriority(int eventId, int newPriority) {
21        map.put(eventId, newPriority);
22        pq.offer(new int[]{newPriority, eventId});
23    }
24    
25    public int pollHighest() {
26         while (!pq.isEmpty()) {
27            int[] top = pq.poll();
28            int priority = top[0];
29            int id = top[1];
30            if (map.containsKey(id) && map.get(id) == priority) {
31                map.remove(id); 
32                return id;
33            }
34        }
35        return -1;
36    }
37}
38
39/**
40 * Your EventManager object will be instantiated and called as such:
41 * EventManager obj = new EventManager(events);
42 * obj.updatePriority(eventId,newPriority);
43 * int param_2 = obj.pollHighest();
44 */