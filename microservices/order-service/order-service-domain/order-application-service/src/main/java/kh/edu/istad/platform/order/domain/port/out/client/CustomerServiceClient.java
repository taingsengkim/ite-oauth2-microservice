package kh.edu.istad.platform.order.domain.port.out.client;

import reactor.core.publisher.Flux;

public interface CustomerServiceClient {

    Flux<String> getCustomerNames();

}
