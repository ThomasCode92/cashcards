package example.cashcard;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.client.RestTestClient;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@AutoConfigureRestTestClient
class CashcardApplicationTests {

    @Autowired
    RestTestClient restClient;

    @Test
    void shouldReturnACashCardWhenDataIsSaved() {
        var response = restClient.get().uri("/cashcards/99").exchange();

        response.expectStatus().isOk();
        response.expectBody().jsonPath("$.id").isEqualTo(99);
        response.expectBody().jsonPath("$.amount").isEqualTo(123.45);
    }

    @Test
    void shouldNotReturnACashCardWithAnUnknownId() {
        var response = restClient.get().uri("/cashcards/1000").exchange();

        response.expectStatus().isNotFound();
        response.expectBody().isEmpty();
    }
}
