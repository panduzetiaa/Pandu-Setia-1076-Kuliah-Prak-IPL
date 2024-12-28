public class Event {
    private String eventType;
    private long timestamp;

    // Constructor untuk menginisialisasi event
    public Event(String eventType, long timestamp) {
        this.eventType = eventType;
        this.timestamp = timestamp;
    }

    // Getter untuk mendapatkan jenis event
    public String getEventType() {
        return eventType;
    }

    // Setter untuk mengatur jenis event
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    // Getter untuk mendapatkan timestamp event
    public long getTimestamp() {
        return timestamp;
    }

    // Setter untuk mengatur timestamp event
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    // Metode untuk menampilkan informasi event
    @Override
    public String toString() {
        return "Event{" +
                "eventType='" + eventType + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
