package tn.esprit.yossr_bessaad_4se.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.yossr_bessaad_4se.Services.SubscriptionServiceImpl;
import tn.esprit.yossr_bessaad_4se.entities.Subscription;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
@AllArgsConstructor
public class SubscriptionRestController {

    private  SubscriptionServiceImpl subscriptionService;

    @PostMapping
    public Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);
    }

    @GetMapping("/{id}")
    public Subscription retrieveSubscription(@PathVariable Long id) {
        return subscriptionService.retrieveSubscription(id);
    }

    @GetMapping
    public List<Subscription> retrieveAllSubscriptions() {
        return subscriptionService.retriveAllSubscriptions();
    }

    @DeleteMapping("/{id}")
    public void deleteSubscription(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
    }

    @PutMapping
    public void updateSubscription(@RequestBody Subscription subscription) {
        subscriptionService.updateSubscription(subscription);
    }
}
