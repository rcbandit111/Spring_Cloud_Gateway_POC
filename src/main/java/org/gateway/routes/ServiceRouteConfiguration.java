package org.gateway.routes;

import org.gateway.filters.LoggingGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Collections;

@Configuration
public class ServiceRouteConfiguration {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder, LoggingGatewayFilterFactory loggingFactory) {

        return builder.routes()


                // Client

                // Application form
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/countries")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/countries", "/merchants/onboarding/countries")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/countries"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/company_types")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/company_types", "/merchants/onboarding/company_types")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/company_types"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/category_code")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/category_code", "/merchants/onboarding/category_code")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/category_code"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/currencies")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/currencies", "/merchants/onboarding/currencies")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/currencies"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/business_structure")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/business_structure", "/merchants/onboarding/business_structure")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/business_structure"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/business_representative")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/business_representative", "/merchants/onboarding/business_representative")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/business_representative"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/business_details")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/business_details", "/merchants/onboarding/business_details")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/business_details"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/support_details")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/support_details", "/merchants/onboarding/support_details")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/support_details"))
                .route("service_route_tickets_summary", r -> r.path("/api/merchants/onboarding/bank_details")
                        .filters(f -> f.rewritePath("/api/merchants/onboarding/bank_details", "/merchants/onboarding/bank_details")
                                .filter(loggingFactory.apply(new LoggingGatewayFilterFactory.Config("My Custom Message", true, true))))
                        .uri("lb://merchant-hub-admin-service/merchants/onboarding/bank_details"))

                .build();
    }
}
