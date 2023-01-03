package controller;

import domain.lotto.number.LottoNumberMaker;
import domain.lotto.number.RandomNumberGenerator;
import domain.lotto.ticket.LottoTicket;
import domain.lotto.ticket.LottoTickets;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    public LottoTickets createLottoTickets(Integer purchaseAmount) {
//        Integer purchaseAmount = InputView.inputPurchaseAmount();
        LottoNumberMaker lottoNumberMaker = new LottoNumberMaker();
        List<LottoTicket> lottoTicketList = new ArrayList<>();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int i = 0; i < purchaseAmount; i++) {
            lottoTicketList.add(new LottoTicket(lottoNumberMaker.makeNumbers(randomNumberGenerator)));
        }
        return new LottoTickets(lottoTicketList);
    }
}