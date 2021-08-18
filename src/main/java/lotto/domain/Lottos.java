package lotto.domain;

import lotto.exception.InputError;

import java.util.List;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(final List<Lotto> lottos) {
        if (lottos == null || lottos.size() == 0) {
            throw new InputError("구매한 로또가 없습니다.");
        }
        this.lottos = lottos;
    }

    public List<Lotto> value() {
        return lottos;
    }
}
