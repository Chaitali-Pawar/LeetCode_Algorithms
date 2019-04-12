import org.json.JSONArray;
import org.json.JSONObject;
//import org.json.simple.JSONArray;

import java.util.*;

class Order{
    private String id;
    private String resource;
    private String type;
    private double latitude;
    private double longitude;
    private String delivery;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}

class Partner{
    private String id;
    private String resource;
    private List<String> type;
    private int capacity;
    private double latitude;
    private double longitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }



}


public class Solver_JSON {

    public void solve(String input){

        JSONObject obj = new JSONObject(input);
        JSONArray orderArray = obj.getJSONArray("orders");
        JSONArray partnerArray = obj.getJSONArray("partners");
        List <Order> orderList = new ArrayList<>();
        for (int i = 0; i < orderArray.length(); i++) {
             Order order = new Order();
             order.setId(orderArray.getJSONObject(i).getString("id"));
             order.setType(orderArray.getJSONObject(i).getString("type"));
             order.setResource(orderArray.getJSONObject(i).getString("resource"));
             order.setDelivery(orderArray.getJSONObject(i).getString("deliverability"));
             order.setLatitude(orderArray.getJSONObject(i).getJSONObject("address").getDouble("latitude"));
             order.setLongitude(orderArray.getJSONObject(i).getJSONObject("address").getDouble("longitude"));
             orderList.add(order);
        }
        List<Partner> partnerList = new ArrayList<>();
        for(int i=0;i<partnerArray.length();i++){
            Partner partner = new Partner();
            partner.setId(partnerArray.getJSONObject(i).getString("id"));
            partner.setResource(partnerArray.getJSONObject(i).getString("resource"));
            partner.setLatitude(partnerArray.getJSONObject(i).getJSONObject("address").getDouble("latitude"));
            partner.setLongitude(partnerArray.getJSONObject(i).getJSONObject("address").getDouble("longitude"));
            partner.setCapacity(partnerArray.getJSONObject(i).getInt("capacity"));
            JSONArray array = partnerArray.getJSONObject(i).getJSONArray("type");
            List<String> typeList = new ArrayList<>();
            for(int j=0;j<array.length();j++){
                typeList.add(array.getString(j));
            }
            partner.setType(typeList );
            partnerList.add(partner);
        }
        Map<String,List<String>> partner_obj_mapping = new LinkedHashMap<>();
        List<String> testOrderList = new ArrayList<>();
        for(Partner partner :partnerList){
            partner_obj_mapping.put(partner.getId(),testOrderList);
        }
        for(Order order:orderList){
            double minimum_distance = Double.MAX_VALUE;
            String partner_id=partnerList.get(0).getId();
            int partner_index =0;
            if(order.getDelivery().equals("deliverable")){
                // find eligible partners
                // check if resource matches
                int j=0;
                for(Partner partner:partnerList){
                    if(order.getResource().equalsIgnoreCase(partner.getResource())){
                        List<String> type = partner.getType();
                        if(type.contains(order.getType())){
                            if(partner.getCapacity()!=0){
                                // compute the distance between object and partner
                                double x1 = order.getLatitude();
                                double y1 = order.getLongitude();
                                double x2 = partner.getLatitude();
                                double y2 = partner.getLongitude();

                                double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
                                if(distance<minimum_distance){
                                    minimum_distance =distance;
                                    partner_id =partner.getId();
                                    partner_index =j;
                                }
                            }
                        }
                    }
                    j++;
                }
                int capacity  =partnerList.get(partner_index).getCapacity();
                partnerList.get(partner_index).setCapacity(capacity -1);
                if(!partner_obj_mapping.get(partner_id).isEmpty()){
                    // append
                    List<String> object = partner_obj_mapping.get(partner_id);
                    object.add(order.getId());
                    partner_obj_mapping.put(partner_id,object);

                }else{
                    List<String> object = new ArrayList<>();
                    object.add(order.getId());
                    partner_obj_mapping.put(partner_id,object);
                }
            }
            // found the eligble partner


        }
        StringBuilder resultString = new StringBuilder();
        for (String partner : partner_obj_mapping.keySet())
        {
            // search  for value
            resultString.append(partner+"\n");
            List<String> orders = partner_obj_mapping.get(partner);
            if(!orders.isEmpty()){
                for(String order :orders){
                    resultString.append(order+"\n");
                }
            }

        }
        System.out.println(resultString.toString());

    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String inputJSONString = scanner.next();
        Solver_JSON solveOB = new Solver_JSON();
        solveOB.solve(inputJSONString);
    }
}
