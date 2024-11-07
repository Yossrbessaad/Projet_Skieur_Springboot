package tn.esprit.yossr_bessaad_4se.Services;

import tn.esprit.yossr_bessaad_4se.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSubscription);
    List<Subscription> retriveAllSubscriptions();
    void deleteSubscription(Long numSubscription);
    void updateSubscription(Subscription subscription);
}
