package common;
import java.time.LocalDate;
import java.util.List;
public class Order {
    private final long id; private final String customerId; private final String region; private final String category; private final int amount; private final String status; private final LocalDate orderedAt; private final List<String> tags;
    public Order(long id, String customerId, String region, String category, int amount, String status, LocalDate orderedAt, List<String> tags) { this.id=id; this.customerId=customerId; this.region=region; this.category=category; this.amount=amount; this.status=status; this.orderedAt=orderedAt; this.tags=tags; }
    public long getId(){return id;} public String getCustomerId(){return customerId;} public String getRegion(){return region;} public String getCategory(){return category;} public int getAmount(){return amount;} public String getStatus(){return status;} public LocalDate getOrderedAt(){return orderedAt;} public List<String> getTags(){return tags;}
    public String toString(){return "Order{id="+id+", customerId='"+customerId+'\''+", region='"+region+'\''+", category='"+category+'\''+", amount="+amount+", status='"+status+'\''+", orderedAt="+orderedAt+", tags="+tags+'}';}
}
