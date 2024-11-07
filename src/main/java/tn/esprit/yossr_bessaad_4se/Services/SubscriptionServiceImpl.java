package tn.esprit.yossr_bessaad_4se.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.yossr_bessaad_4se.entities.Subscription;
import tn.esprit.yossr_bessaad_4se.repositories.ISubscriptionRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class SubscriptionServiceImpl implements ISubscriptionService {
    private  ISubscriptionRepository subscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSubscription) {
        Optional<Subscription> subscription = subscriptionRepository.findById(numSubscription);
        return subscription.orElse(null);
    }

    @Override
    public List<Subscription> retriveAllSubscriptions() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void deleteSubscription(Long numSubscription) {
        subscriptionRepository.deleteById(numSubscription);
    }

    @Override
    public void updateSubscription(Subscription subscription) {
        subscriptionRepository.save(subscription);
    }
}
