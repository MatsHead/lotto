package pl.akademiakodu.lotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoController {
//    deklaracja
    private LottoGenerator lottoGenerator;
    /*
        Jeśli mamy pola typu interfejsowego to przy inicjalizacji zmiennej
        musimy stworzyć obiekt klasy, kótra implementuje dany interfejs
        w tym przypadku LottoGenerator
        Patrz lininjka 24
     */

    public void setLottoGenerator(LottoGenerator lottoGenerator) {
        this.lottoGenerator = lottoGenerator;
    }

    @GetMapping("/")
    public String getIndex(ModelMap map){
//        inicjacja
        setLottoGenerator(new HardLottoGenerator());
        map.put("numbers", lottoGenerator.generateDescription());
        return "index";
    }
}
