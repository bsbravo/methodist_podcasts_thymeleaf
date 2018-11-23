package com.bravo.methodist.podcast.episodes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/episode")
public class EpisodeController {
	
	@GetMapping
	public String all() {
		log.info("call getMapping");
		return "episode";
	}

}
