class TimeMap {
    String key;
    String value;
    int timestamp;

    public TimeMap() {
        

        
    }
    
    public void set(String key, String value, int timestamp) {
        this.key = key;
        this.value = value;
        this.timestamp = timestamp;
        

        
    }
    
    public String get(String key, int timestamp) {
        if (this.key.equals(key) && this.timestamp <= timestamp) {
            return this.value;
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */