;; This is an attempt TO identify the definitions of the areas of:
;; Birmingham, 'Midland', The Midlands and several definitions of 'West Midlands'.
;; Some of the data is in Lisp list format, to keep track of nesting, so a parenthesis-aware
;; editor is helpful.
;; It would be naive to believe it can be represented by a single tree structure.
;; Sometimes though, the parenthesis is just parenthesis
;;            - don't THINK this is confusing but please tell @woo if it is

;; How the West Midlands fits into the UK

(United Kingdom
        (Scotland, Wales, Northern Ireland,
        England (
        English Regions(
                Greater London,
                South East,
                South West,
                North West,
                North East,
                Yorkshire and the Humber,
                East Midlands,
                West Midlands))))

(The Midlands ("Powerhouse")                
     East Midlands,
     West Midlands (Region))

;; The Region - http://visitbirmingham.com/the-region/

(Counties in the West Midlands Region
          ("Midland Counties"(
                    Staffordshire
                    Warwickshire
                    West Midlands
                    Worcestershire))

          ("Out West" Midlands(
                    Herefordshire
                    Shropshire)))

;; 'Midland' is a notional core area of the Birmingham Tech community
;; but it has very flexible boundary. It is approximately the 'Midland Counties' but not 
;; North Staffordshire, because people there generally see Stoke on Trent as their major city. 

( West Midlands Combined Authority ;; 18 Local Authorities & a Metro Mayor https://www.wmca.org.uk
     (Birmingham, 
     Coventry, 
     Solihull, 

     ; Black Country Metropolitan District Council areas
     (Dudley, Sandwell, Walsall, Wolverhampton)))

(Birmingham ;; From: http://visitbirmingham.com/birmingham-areas/birmingham/
   Digbeth
   Balti Triangle
   Birmingham Airport
   Brindley Place
   Broad Street
   Chinatown
   City Centre
   Colmore Business District
   Eastside
   Gay Village
   The Jewellery Quarter
   Southside
   The Mailbox (just a shopping centre?)
   Theatreland
   The NEC

;; The Birmingham 'burbs - http://visitbirmingham.com/birmingham-areas/wider-birmingham/

   (Brum-Burbs
        Acocks Green
        Alum Rock
        Coventry Road
        Harborne
        Kings Heath
        Lozells, Villa & Soho Roads
        Moseley
        Selly Oak
        Sparkbrook & Springfield
        Sutton Coldfield
        Yew Tree (just a shopping centre?)))

(The Black Country

     (Definition
          (Traditionally: where coal comes to the surface
                 (West Bromwich, Oldbury, Blackheath, Cradley Heath, 
                  Old Hill, Bilston, Dudley, Tipton, Wednesfield)
                  and parts of (Halesowen, Wednesbury and Walsall)
                  but NOT (Wolverhampton, Stourbridge and Smethwick / Warley.))
          (Today: [most of] Metropolitan District Council areas 
                   (Dudley, Sandwell, Walsall, Wolverhampton))))

;; Also: parliamentary constituencies, post codes.
