package Heap.Questions;
import java.util.*;
    public class Twitter {
        private static int timestamp=0;

        private Map<Integer,user>userMap;
        public class user{

            public int id;
            public Set<Integer>followed;
            public Tweet tweet_head;

            public user(int id){
                this.id=id;
                followed=new HashSet<>();
                follow(id);
                tweet_head=null;
            }
            public void follow(int id){
                followed.add(id);
            }

            public void unfollow(int id){
                followed.remove(id);
            }

            public void post(int id){
                Tweet t=new Tweet(id);
                t.next=tweet_head;
                tweet_head=t;
            }

        }

        private class Tweet{

            public int id;
            public int time;
            public Tweet next;

            public Tweet(int id){
                this.id=id;
                time=timestamp;
                timestamp++;
                next=null;
            }
        }

        public Twitter() {
            userMap=new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            if(!userMap.containsKey(userId)){
                user u=new user(userId);
                userMap.put(userId,u);
            }
            userMap.get(userId).post(tweetId);
        }

        public List<Integer> getNewsFeed(int userId) {
            List<Integer>res=new LinkedList<>();
            if(!userMap.containsKey(userId))return res;

            Set<Integer>users=userMap.get(userId).followed;

            PriorityQueue<Tweet>pq=new PriorityQueue<>(users.size(),(a,b)->(b.time - a.time));

            for(int u:users){
                Tweet t=userMap.get(u).tweet_head;

                if(t!=null)pq.add(t);
            }

            int n=0;
            while(!pq.isEmpty()&&n<10){
                Tweet tw=pq.poll();
                res.add(tw.id);
                n++;

                if(tw.next!=null){
                    pq.add(tw.next);

                }
            }
            return res;

        }

        public void follow(int followerId, int followeeId) {
            if(!userMap.containsKey(followerId)){
                user u=new user(followerId);
                userMap.put(followerId,u);
            }
            if(!userMap.containsKey(followeeId)){
                user u=new user(followeeId);
                userMap.put(followeeId,u);
            }

            userMap.get(followerId).follow(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if(!userMap.containsKey(followerId)||!userMap.containsKey(followeeId)||followerId==followeeId){
                return;
            }

            userMap.get(followerId).unfollow(followeeId);

        }

}
