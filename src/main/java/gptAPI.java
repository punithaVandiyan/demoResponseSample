
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class gptAPI {

        public void getAnswer() {
            // Specify the base URL to the RESTful web service
            RestAssured.baseURI = "https://llmtutor.ck12.org";

            RequestSpecification httpRequest = RestAssured.given();

            httpRequest.header("Content-Type", "application/json");
            httpRequest.body("{\"prompt\":\"what is mitosis?\"}");
            Response response = httpRequest.post("/plaiground/api/ai");

            System.out.println("Status received => " + response.getStatusLine());
            System.out.println("Response=>" + response.prettyPrint());

        }
        //public static void main(String[] args){
        // gptAPITest rest = new gptAPITest();
        // rest.getAnswer();
        // }*/
    }


