package lotto.domain;

import java.util.List;

public final class Lottos {

    private final List<Lotto> lottos;

    private Lottos(final List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public static Lottos from(final List<Lotto> lottos) {
        return new Lottos(lottos);
    }

    public int count() {
        return lottos.size();
    }

    public List<Lotto> getLottos() {
        return this.lottos;
    }

}
