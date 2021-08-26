package com.auctus.jokenpo.services;


import com.auctus.jokenpo.models.Entrada;
import com.auctus.jokenpo.models.Regras;
import com.auctus.jokenpo.models.Rodada;
import com.auctus.jokenpo.repository.RegrasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegrasService {

    @Autowired
    RegrasRepository regraRepository;


}
