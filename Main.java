package com.company;

import com.company.award.Award;
import com.company.award.NominationHelper;
import com.company.nominator.Nominator;
import com.company.nominee.Nominee;

public class Main {

    public static void main(String[] args) {

        Nominator soo = new Nominator("Soo");
        Nominee kara = new Nominee("Kara");
        kara.setNomineeAwardQuantityLimit(5);
        kara.setNomineeAwardAmountLimit(500f);
        soo.setNominatorAwardQuantityLimit(5);
        soo.setNominatorAwardAmountLimit(500f);

        Award award1 = new Award (100, 0.75);

        while ((NominationHelper.belowAwardQuantityLimit(soo.getNominatorAwardQuantitySum(), 5) &&
                NominationHelper.belowAwardAmountLimit(soo.getNominatorAwardAmountSum(), 500))&&
                (NominationHelper.belowAwardAmountLimit1(kara.getNomineeAwardAmountSum(), 500) &&
                        NominationHelper.belowAwardQuantityLimit1(kara.getNomineeAwardQuantitySum(), 5))) {
            soo.nominate(kara, award1);
        }

    }
}
