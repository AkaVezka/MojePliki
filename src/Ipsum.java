public class Ipsum {
    public static void main(String[] args) {
        System.out.println(isPalindrom("Anna","ania"));
        System.out.println(Przestaw("niewiem"));
        System.out.println(ipsum("niewiem"));
    }
    /********************************************************
     * nazwa funkcji: Przestaw
     * parametry wejściowe: <zmienne slowo> - <zmienne typu String>
     * wartość zwracana: wartosc zwracana jest to
     * * Słowo które zostało przestawione
     * autor: Damian Bednarski 2pp
     * ********************************************************/
            public static String Przestaw(String slowo) {


                return slowo;
            }

    /********************************************************
     * nazwa funkcji: isPalindrom
     * parametry wejściowe: <zmienne zdanie1, zdanie2> - <zmienne typu String>
     * wartość zwracana: wartosc zwracana jest to
     * * true - zdania są równe
     * * false - zdania nie są równe
     * autor: Damian Bednarski 2pp
     * ********************************************************/
    public static boolean isPalindrom(String zdanie1, String zdanie2) {
        if (zdanie1.length() == zdanie2.length()) {
            return true;
        } else {
            return false;
        }

        }
    /********************************************************
     * nazwa funkcji: ipsum
     * parametry wejściowe: <zmienne teskt,> - <zmienne typu String>
     * wartość zwracana: wartosc zwracana jest to
     * * Dlugosc tekstu
     * autor: Damian Bednarski 2pp
     * ********************************************************/

        public static String ipsum(String teskt) {
            teskt = "Lorem ipsum dolor sit amet,consectetur adipiscing elit. Suspendisse volutpat aliquet venenatis. Proin mollis, ligula ac dignissim molestie, lacus tellus feugiat mi, sit amet condimentum ex orci in nulla. Quisque blandit vulputate tortor. Nunc eu ipsum vitae nulla tristique suscipit. Mauris tincidunt semper est. Nullam malesuada ullamcorper lacinia. Fusce mattis nulla fringilla ullamcorper aliquet. Morbi pulvinar nisi nec pretium tincidunt. Vestibulum non est nibh. Sed sit amet nunc non sem mollis mollis. Vestibulum non diam tristique, suscipit est quis, gravida arcu. Quisque lectus mauris, facilisis tristique maximus eget, hendrerit semper nunc. Suspendisse potenti. Donec cursus sit amet urna vitae tristique. Mauris gravida sem eu risus mattis, vel suscipit ex sodales. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vivamus varius eleifend lacus, sed sollicitudin odio volutpat non. Aenean efficitur urna posuere nulla dignissim mattis. Nam non erat sem. Sed accumsan est turpis, sed bibendum leo molestie sit amet. Nullam vitae velit ut nulla facilisis vehicula at non lorem. Etiam aliquet neque iaculis est mollis, nec aliquet neque congue. Suspendisse non tortor nec mi posuere convallis. Donec erat elit, aliquet a neque sed, porttitor varius odio. Proin posuere, ipsum quis venenatis consequat, elit mi porttitor lectus, sed pulvinar elit enim in felis. Proin magna elit, tincidunt ac erat eu, posuere vulputate libero. Duis lacinia ac magna in eleifend. Curabitur nec imperdiet lacus. Mauris non odio tincidunt, dignissim nibh vitae, ullamcorper ligula. Morbi aliquam neque mi, vitae hendrerit velit cursus non. Aliquam suscipit interdum eros, quis tincidunt urna varius eget. Sed non ante molestie, congue elit eu, rutrum ipsum. Pellentesque consectetur ipsum sit amet imperdiet scelerisque. Integer eu porta purus. Donec viverra tincidunt sapien, ut porta turpis lacinia et. Aliquam erat volutpat. Donec varius sollicitudin neque elementum iaculis. Ut venenatis purus in velit consectetur, lacinia interdum sapien tempor. Suspendisse aliquam sapien a justo accumsan cursus. Quisque efficitur elit ipsum, at volutpat mauris ultrices at. Nullam aliquam vulputate tortor ac efficitur. Cras vel ipsum ullamcorper, molestie sapien a, aliquam justo. Etiam elementum odio ut faucibus pulvinar. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nullam interdum nibh ac dapibus tempus. Maecenas elit tortor, tempor et blandit nec, faucibus eu ipsum. Ut eu neque enim.";

        int stringLength = teskt.length();
        System.out.println(": " + stringLength);
        return teskt;
    }


}

