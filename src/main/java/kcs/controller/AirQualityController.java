package kcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirQualityController {

    @GetMapping("/air-quality-advice")
    public String getAirQualityAdvice(@RequestParam int airQualityIndex) {
        if (airQualityIndex <= 50) {
            return "오늘은 공기가 정말 맑고 깨끗해요! 🌟 밖에서 신나게 놀고, 산책도 하고 피크닉도 해도 좋답니다. 창문도 활짝 열어 신선한 공기를 마음껏 마셔보세요!";
        } else if (airQualityIndex <= 100) {
            return "공기가 괜찮아요! 😌 하지만 너무 과하게 놀지는 말고, 조금은 쉬어가며 활동하세요. 기분이 좀 피곤하거나 목이 아프면 집에서 편히 쉬는 것도 좋겠죠?";
        } else if (airQualityIndex <= 250) {
            return "공기가 조금 나빠졌네요. 🥺 밖에서 오래 놀기보다는 집에서 시간을 보내는 게 좋겠어요. 마스크를 착용하고 잠깐 외출하는 건 괜찮지만, 너무 오랫동안 있지는 말아요.";
        } else if (airQualityIndex <= 350) {
            return "공기가 많이 나빠졌어요. 😷 가능한 한 집에 머물며 공기청정기를 켜고, 창문은 닫아 두세요. 꼭 외출해야 한다면, 마스크를 착용하고 짧은 시간만 나가세요.";
        } else {
            return "공기가 너무 위험해요! 😱 모든 실외 활동을 피하고, 실내에서만 지내는 것이 좋겠어요. 창문을 닫고 공기청정기를 사용하며, 실내에서도 너무 무리하지 말고 푹 쉬세요.";
        }
    }
}

