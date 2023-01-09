package chapterSeven.MBTIPersonalityTest;

import java.util.Scanner;

public class MBTITest {
    private static final Scanner scanner = new Scanner(System.in);

    String[] introvertAndExtrovertSection = new String[5];
    String[] sensingAndIntuitiveSection = new String[5];
    String[] thinkingAndFeelingSection = new String[5];
    String[] judgingAndPerceptiveSection = new String[5];
    String[] EIResponse = new String[5];
    String[] SIResponse = new String[5];
    String[] TFResponse = new String[5];
    String[] JPResponse = new String[5];
    String name;
    int E = 0;
    int I = 0;

    int S = 0;
    int N = 0;

    int T = 0;
    int F = 0;

    int J = 0;
    int P = 0;



    public void displayQuestions() {
        System.out.println("What is your name: ");
        name = scanner.nextLine();

        setIntrovertAndExtrovert();
        setSensingAndIntuitive();
        setThinkingAndFeeling();
        setJudgingAndPerceptive();


        System.out.println();
        System.out.println("Hello " + name + " You selected");


        for (int row = 0; row < EIResponse.length; row++) {
            System.out.print(EIResponse[row]+ "  -  " + introvertAndExtrovertSection[row] + "\n");
        }
        System.out.println("Number of A Selected: " + E);
        System.out.println("Number of B Selected: " + I);
        System.out.println();

        for (int row = 0; row < SIResponse.length; row++) {
            System.out.print(SIResponse[row]+ "  -  " + sensingAndIntuitiveSection[row] + "\n");
        }
        System.out.println("Number of A Selected: " + S);
        System.out.println("Number of B Selected: " + N);
        System.out.println();

        for (int row = 0; row < TFResponse.length; row++) {
            System.out.print(TFResponse[row]+ "  -  " + thinkingAndFeelingSection[row] + "\n");
        }
        System.out.println("Number of A Selected: " + T);
        System.out.println("Number of B Selected: " + F);
        System.out.println();

        for (int row = 0; row < JPResponse.length; row++) {
            System.out.print(JPResponse[row] + "  -  " + judgingAndPerceptiveSection[row] + "\n");
        }
        System.out.println("Number of A Selected: " + J);
        System.out.println("Number of B Selected: " + P);
        System.out.println();

        System.out.println("            PERSONALITY RESULT TABLE"                     );
        System.out.println("=========================================================");
        System.out.printf("%s%5s%7s%5s%5s%7s%5s%5s%7s%5s%5s%n", "A", "B"," ", "A", "B"," ", "A", "B", " ", "A", "B");
        System.out.println("=========================================================");
        System.out.printf("%d%5d%7s%5d%5d%7s%5d%5d%7s%5d%5d%n", E, I, " ", S, N," ", T, F," ", J, P);
        System.out.printf("%s%5s%7s%5s%5s%7s%5s%5s%7s%5s%5s%n", "E", "I"," ", "S", "N"," ", "T", "F", " ", "J", "P");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println();
        System.out.println();


        if (E>I && S>N && T>F && J>P) {
            ESTJ();
        }

        if (I>E && N>S && F>T && P>J) {
            INFP();
        }

        if (I>E && N>S && T>F && J>P) {
            INTJ();
        }

        if (I>E && N>S && T>F && P>J) {
            INTP();
        }

        if (E>I && N>S && T>F && J>P) {
            ENTJ();
        }

        if (E>I && N>S && T>F && P>J) {
            ENTP();
        }

        if (I>E && N>S && F>T && J>P) {
            INFJ();
        }

        if (E>I && N>S && F>T && J>P) {
            ENFJ();
        }

        if (E>I && N>S && F>T && P>J) {
            ENFP();
        }

        if (I>E && S>N && T>F && J>P) {
            ISTJ();
        }

        if (I>E && S>N && F>T && J>P) {
            ISFJ();
        }

        if (E>I && S>N && F>T && J>P) {
            ESFJ();
        }

        if (I>E && S>N && T>F && P>J) {
            ISTP();
        }

        if (I>E && S>N && F>T && P>J) {
            ISFP();
        }

        if (E>I && S>N && T>F & P>J) {
            ESTP();
        }

        if (E>I && S>N && F>T && P>J) {
            ESFP();
        }

        System.out.println();
    }


    public void setIntrovertAndExtrovert() {
        introvertAndExtrovertSection[0] = "A) Expand energy, enjoy groups      B) Conserve energy, enjoy one-on-one";
        introvertAndExtrovertSection[1] = "A) More outgoing, think out loud    B) More reserved, think to yourself";
        introvertAndExtrovertSection[2] = "A) Seek many tasks, public activities, interaction with others    B) Seek private, solitary activities with quiet to concentrate";
        introvertAndExtrovertSection[3] = "A) External, communicative, express yourself    B) Internal, reticent, keep to yourself";
        introvertAndExtrovertSection[4] = "A) Active, initiate    B) Reflective, deliberate";

        for (int row = 0; row < introvertAndExtrovertSection.length; row++) {
                System.out.println(introvertAndExtrovertSection[row]);
                EIResponse[row] = scanner.nextLine();



                if (EIResponse[row].equalsIgnoreCase("A")) {
                    E++;
                } else if (EIResponse[row].equalsIgnoreCase("B")) {
                    I++;
                } else {
                    System.out.println("Enter A or B");
                    System.out.println("Please try again!!!");
                    System.out.println(introvertAndExtrovertSection[row]);
                    EIResponse[row] = scanner.nextLine();
                }

            }

        }



    public void setSensingAndIntuitive() {
        sensingAndIntuitiveSection[0] = "A) Interpret literally    B) Look for meaning and possibilities";
        sensingAndIntuitiveSection[1] = "A) Practical, realistic, experiential    B) Imaginative, innovative, theoretical";
        sensingAndIntuitiveSection[2] = "A) Standard, usual, conventional    B) Different, novel, unique";
        sensingAndIntuitiveSection[3] = "A) Focus on here-and-now    B) Look to the future, global perspective, big picture";
        sensingAndIntuitiveSection[4] = "A) Facts, things, what is?    B) Ideas, dreams, what could be, philosophical";

        for (int row = 0; row < sensingAndIntuitiveSection.length; row++) {
            System.out.println(sensingAndIntuitiveSection[row]);
            SIResponse[row] = scanner.next();


            if (SIResponse[row].equalsIgnoreCase("A")) {
                S++;
            } else if (SIResponse[row].equalsIgnoreCase("B")) {
                N++;
            } else {
                System.out.println("Enter A or B");
            }

        }
    }


    public void setThinkingAndFeeling() {
        thinkingAndFeelingSection[0] = "A) Logical, thinking, questioning   B) Empathetic, feeling, accommodating";
        thinkingAndFeelingSection[1] = "A) Candid, straightforward, frank   B) Tactful, kind, encouraging";
        thinkingAndFeelingSection[2] = "A) Firm, tend to criticize, hold the line   B) Gentle, tend to appreciate, conciliate";
        thinkingAndFeelingSection[3] = "A) Tough-minded, just   B) Tender-hearted, merciful";
        thinkingAndFeelingSection[4] = "A) Matter of fact, issue-oriented    B) Sensitive, people-oriented, compassionate";

        for (int row = 0; row < thinkingAndFeelingSection.length; row++) {
            System.out.println(thinkingAndFeelingSection[row]);
            TFResponse[row] = scanner.next();


            if (TFResponse[row].equalsIgnoreCase("A")) {
                T++;
            } else if (TFResponse[row].equalsIgnoreCase("B")) {
                F++;
            } else {
                System.out.println("Enter A or B");
            }

        }
    }


    public void setJudgingAndPerceptive() {
        judgingAndPerceptiveSection[0] = "A) Organized, orderly    B) Flexible, adaptable";
        judgingAndPerceptiveSection[1] = "A) Plan, schedule    B) Unplanned, spontaneous ";
        judgingAndPerceptiveSection[2] = "A) Regulated, structured    B) Easy-going, live and let live ";
        judgingAndPerceptiveSection[3] = "A) Preparation, plan ahead    B) Go with the flow, adapt as you go";
        judgingAndPerceptiveSection[4] = "A) Control, govern    B) Latitude, freedom";

        for (int row = 0; row < judgingAndPerceptiveSection.length; row++) {
            System.out.println(judgingAndPerceptiveSection[row]);
            JPResponse[row] = scanner.next();



            if (JPResponse[row].equalsIgnoreCase("A")) {
                J++;
            } else if (JPResponse[row].equalsIgnoreCase("B")) {
                P++;
            } else {
                System.out.println("Enter A or B");
            }

        }
    }

    public boolean INTJ() {
        System.out.println("Architect");
        System.out.println();
        System.out.println("INTRODUCTION");
        System.out.println("""
                An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits.
                These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do.
                Their inner world is often a private, complex one.It can be lonely at the top. As one of the rarest personality types – and one of the most capable –\s
                Architects (INTJs) know this all too well. Rational and quick-witted, Architects pride themselves on their ability to think for themselves,\s
                not to mention their uncanny knack for seeing right through phoniness and hypocrisy. But because their minds are never at rest,\s
                Architects may struggle to find people who can keep up with their nonstop analysis of everything around them.""");
        System.out.println();
        System.out.println("""
                A Pioneering Spirit
                Architects question everything. Many personality types trust the status quo, relying on conventional wisdom and other people’s expertise to guide their lives.\s
                But ever-skeptical Architects prefer to make their own discoveries. In their quest to find better ways of doing things, they aren’t afraid to break the rules or risk disapproval –\s
                in fact, they rather enjoy it. But as anyone with this personality type would tell you, a new idea isn’t worth anything unless it actually works.\s
                Architects want to be successful, not just inventive. They bring a single-minded drive to their work, applying the full force of their insight, logic, and willpower.
                 And heaven help anyone who tries to slow them down by enforcing pointless rules or offering poorly thought-out criticism.
                This personality type comes with a strong independent streak. Architects don’t mind acting alone, perhaps because they don’t like waiting around for others to catch up with them.
                 They also generally prefer making decisions without asking for anyone else’s input. At times, this lone-wolf behavior can come across as insensitive, as it fails to take into consideration other people’s thoughts, desires, and plans.
                It would be a mistake, however, to view Architects as uncaring. Whatever the stereotypes about their stoic intellect, these personalities feel deeply.\s
                When things go wrong or when they hurt others, Architects are personally affected and spend much time and energy trying to figure out why things happened the way that they did.\s
                They may not always value emotion as a decision-making tool, but they are authentically human.
                """);
        System.out.println();
        System.out.println("A Thirst for Knowledge\n" +
                "Architects can be both the boldest of dreamers and the bitterest of pessimists. They believe that, through willpower and intelligence, they can achieve even the most challenging goals. \n" +
                "But these personalities may be cynical about human nature more generally, assuming that most people are lazy, unimaginative, or simply doomed to mediocrity.\n " +
                "People with the Architect personality type derive much of their self-esteem from their knowledge and mental acuity. In school, they may have been called “bookworms” or “nerds.” \n" +
                "But rather than taking these labels as insults, many Architects embrace them. They recognize their own ability to teach themselves about – and master – any topic that interests them, whether that’s coding or capoeira or classical music.\n" +
                "Architects can be single-minded, with little patience for frivolity, distractions, or idle gossip. That said, they’re far from dull or humorless.\n " +
                "Many Architects are known for their irreverent wit, and beneath their serious exteriors, they often have a sharp, delightfully sarcastic sense of humor.\n");
        System.out.println();
        System.out.println("Social Frustrations\n" +
                "Architects aren’t known for being warm and fuzzy. They tend to prioritize rationality and success over politeness and pleasantries – in other words, they’d rather be right than popular. \n" +
                "This may explain why so many fictional villains are modeled on this personality type. Because Architects value truth and depth, many common social practices – from small talk to white lies – may seem pointless or downright stupid to them. \n" +
                "As a result, they may inadvertently come across as rude or even offensive when they’re only trying to be honest. But like any personality type, Architects do crave social interaction – they’d just prefer to surround themselves with people who share their values and priorities. \n" +
                "Often, they can achieve this just by being themselves. When Architects pursue their interests, their natural confidence can draw people to them – professionally, socially, and even romantically.\n");
        System.out.println();
        System.out.println("The Chess Game of Life\n" +
                "Architects are full of contradictions. They are imaginative yet decisive, ambitious yet private, and curious yet focused. From the outside, these contradictions may seem baffling, but they make perfect sense once you understand the inner workings of the Architect mind.\n" +
                "For these personalities, life is like a giant game of chess. Relying on strategy rather than chance, Architects contemplate the strengths and weaknesses of each move before they make it. \n" +
                "And they never lose faith that, with enough ingenuity and insight, they can find a way to win – no matter what challenges might arise along the way.\n");
        return false;
    }



    public boolean INTP() {
        System.out.println("LOGICIAN");
        System.out.println();
        System.out.println("""
                INTRODUCTION
                A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life.\s
                They often seek out unlikely paths, mixing willingness to experiment with personal creativity.""");

        System.out.println("""
                Logicians pride themselves on their unique perspectives and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been Logicians.\s
                This personality type is fairly rare, but with their creativity and inventiveness, Logicians aren’t afraid to stand out from the crowd.
                
                The Life of the Mind
                Logicians often lose themselves in thought – which isn’t necessarily a bad thing. People with this personality type hardly ever stop thinking. From the moment they wake up, their minds buzz with ideas, questions, and insights.\s
                At times, they may even find themselves conducting full-fledged debates in their own heads.Imaginative and curious, Logician personalities can find endless fascination in the workings of their own mind.
                From the outside, Logicians may seem to live in a never-ending daydream. They have a reputation for being pensive, detached, and a bit reserved.
                That is, until they try to train all of their mental energy on the moment or the person at hand, which can be a bit uncomfortable for everyone.\s
                But regardless of which mode they’re in, Logicians are Introverts and tend to get tired out by extensive socializing. After a long day, they crave time alone to consult their own thoughts.
                But it would be a mistake to think that Logicians are unfriendly or uptight. When they connect with someone who can match their mental energy, these personalities absolutely light up, leaping from one thought to another.
                Few things energize them like the opportunity to swap ideas or enjoy a lively debate with another curious, inquiring soul.
                
                Elementary, My Dear Logician
                Logicians love to analyze patterns. Without necessarily knowing how they do it, people with this personality type often have a Sherlock Holmes–like knack for spotting discrepancies and irregularities. In other words, it’s a bad idea to lie to them.
                Ironically, Logicians shouldn’t always be held at their word. They rarely mean to be dishonest, but with their active minds, they sometimes overflow with ideas and theories that they haven’t thought through all the way.
                 They may change their mind on anything from their weekend plans to a fundamental moral principle, without ever realizing that they’d appeared to have made up their mind in the first place.\s
                In addition, they are often happy to play devil’s advocate in order to keep an interesting discussion humming along.For Logicians, the best conversations are like brainstorming sessions, with plenty of room for unconventional thoughts and off-the-wall what-ifs.
                Logicians could spend all day musing about ideas and possibilities – and they often do. That said, the practical, everyday work of turning those ideas into reality doesn’t always hold their interest.\s
                Fortunately, when it comes to dissecting a tricky, multilayered problem and coming up with a creative solution, few personality types can match Logicians’ creative genius and potential.
                
                Mysteries of the Universe
                People with this personality type want to understand everything in the universe, but one area in particular tends to mystify them: human nature. As their name suggests, Logicians feel most at home in the realm of logic and rationality.
                As a result, they can find themselves baffled by the illogical, irrational ways that feelings and emotions influence people’s behavior – including their own. This doesn’t mean that Logicians are unfeeling.\s
                These personalities generally want to offer emotional support to their friends and loved ones, but they don’t necessarily know how.\s
                And because they can’t decide on the best, most efficient way to offer support, they may hold off on doing or saying anything at all. This “analysis paralysis” can affect multiple areas of Logicians’ lives.
                People with this personality type can overthink even the smallest of decisions. This makes them feel ineffective and stuck, so exhausted by the endless parade of thoughts in their mind that they struggle to get things done.
                The good news is that Logicians don’t have to stay stuck for long. Their unique strengths include everything they need to pull themselves out of the ruts that they occasionally fall into.
                By leveraging their creativity and their open-mindedness, Logicians can reach their full potential – both as thinkers and as happy, well-rounded people.""");
        return false;
    }



    public boolean ENTJ() {
        System.out.println("COMMANDER");
        System.out.println();
        System.out.println("INTRODUCTION" +
                "A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them\n");
        System.out.println("""
                Commanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence, and project authority in a way that draws crowds together behind a common goal.
                However, Commanders are also characterized by an often ruthless level of rationality, using their drive, determination and sharp minds to achieve whatever end they’ve set for themselves.
                Perhaps it is best that they make up only three percent of the population, lest they overwhelm the more timid and sensitive personality types that make up much of the rest of the world – but we have Commanders to thank for many of the businesses and institutions we take for granted every day.
                
                Striving for Greatness
                If there’s anything Commanders love, it’s a good challenge, big or small, and they firmly believe that given enough time and resources, they can achieve any goal. This quality makes people with the Commander personality type brilliant entrepreneurs,\s
                and their ability to think strategically and hold a long-term focus while executing each step of their plans with determination and precision makes them powerful business leaders. This determination is often a self-fulfilling prophecy,\s
                as Commanders push their goals through with sheer willpower where others might give up and move on, and their Extraverted (E) nature means they are likely to push everyone else right along with them, achieving spectacular results in the process.
                At the negotiating table, be it in a corporate environment or buying a car, Commanders are dominant, relentless, and unforgiving. This isn’t because they are coldhearted or vicious per se – it’s more that Commander personalities genuinely enjoy the challenge,
                the battle of wits, the repartee that comes from this environment, and if the other side can’t keep up, that’s no reason for Commanders to fold on their own core tenet of ultimate victory.
                The underlying thought running through the Commander mind might be something like "I don’t care if you call me an insensitive b*****d, as long as I remain an efficient b*****d".
                If there’s anyone Commanders respect, it’s someone who is able to stand up to them intellectually, who is able to act with a precision and quality equal to their own. Commander personalities have a particular skill in recognizing the talents of others,\s
                and this helps in both their team-building efforts (since no one, no matter how brilliant, can do everything alone), and to keep Commanders from displaying too much arrogance and condescension. However, they also have a particular skill in calling out others’\s
                failures with a chilling degree of insensitivity, and this is where Commanders really start to run into trouble.
                
                A Worthy Challenge
                Emotional expression isn’t the strong suit of any Analyst type, but Commanders’ distance from their emotions is especially public, and felt directly by a much broader swath of people. Especially in a professional environment,
                Commanders will simply crush the sensitivities of those they view as inefficient, incompetent or lazy. To people with the Commander personality type, emotional displays are displays of weakness, and it’s easy to make enemies with this approach –\s
                Commanders will do well to remember that they absolutely depend on having a functioning team, not just to achieve their goals, but for their validation and feedback as well, something Commanders are, curiously, very sensitive to.
                Commanders are true powerhouses, and they cultivate an image of being larger than life – and often enough they are. They need to remember though, that their stature comes not just from their own actions, but from the actions of the team that props them up,\s
                and that it’s important to recognize the contributions, talents and needs, especially from an emotional perspective, of their support network. Even if they have to adopt a "fake it ‘til you make it" mentality, if Commanders are able to combine an emotionally healthy focus alongside their many strengths,\s
                they will be rewarded with deep, satisfying relationships and all the challenging victories they can handle.""");
        return false;
    }


    public boolean ENTP() {
        System.out.println("DEBATER");
        System.out.println();
        System.out.println("""
                INTRODUCTION Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.
                They pursue their goals vigorously despite any resistance they might encounter.
                """);
        System.out.println("""
                Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone.
                Few things light up people with this personality type more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
                It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited. Instead, people with this personality type are knowledgeable and curious, with a playful sense of humor, and they can be incredibly entertaining.
                They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited debate. Debaters are the ultimate devil’s advocates, thriving on the process of shredding arguments and beliefs and letting the ribbons drift in the wind for all to see.
                Debaters are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned, no idea is too fundamental to be scrutinized, and no rule is too important to be broken, or at least thoroughly tested.\s
                Sometimes Debaters even rebel against their own beliefs by arguing the opposing viewpoint – just to see how the world looks from the other side.
                As Debaters see it, most people are too ready to do as they’re told and blindly conform to social norms, pressures, and standards. Debaters enjoy the mental exercise of questioning the prevailing mode of thought, and they take a certain pleasure in uncovering the value of underdogs and outliers.\s
                Their active minds can’t help but rethink the things that everyone else takes for granted and push them in clever new directions. For many Debaters, one of life’s greatest challenges is to translate their wide-ranging intellectual energy into real-world achievements and contributions.
                While Debater personalities love to brainstorm and think big, they tend to avoid getting caught doing the “grunt work” of implementing their ideas. To some extent, this makes sense – Debaters have far too many thoughts and suggestions to keep track of them all, let alone turn them into reality.\s
                But unless Debaters develop the willingness to identify and actually follow through on their priorities, they may struggle to harness their full potential.
                
                The Cost of Contrarianism
                Debaters’ capacity for debate is legendary, but that doesn’t mean that it’s always helpful. When they openly question their boss in a meeting or pick apart everything their significant other says, Debaters may think that they’re being champions of rationality and logic.\s
                But they may also be doing their chances of success and happiness more harm than good. Not every occasion calls for this personality type’s default contrarianism, and most people can only stand to have their beliefs questioned and their feelings brushed aside for so long.\s
                As a result, Debaters may find that their quarrelsome fun burns many bridges, often inadvertently. Debaters are respected for their vision, confidence, knowledge, and keen sense of humor – but unless they cultivate a bit of sensitivity, they may struggle to maintain deeper relationships or even to achieve their professional goals.
                Many Debaters find that a more compassionate approach is worth exploring as they strive to build solid relationships. With time, many Debaters realize that their ideal life involves other people and that spending too much energy on “winning” arguments ultimately means robbing themselves of the support that they need to get where they want to be in life.
                The good news is that people with this personality type will never lose their sharply nonconformist edge. They can simply use their cognitive flexibility to understand and explore other people’s perspectives, recognizing the value of consideration and compromise alongside logic and progress.
                """);

        return false;
    }


    public boolean INFJ() {
        System.out.println("ADVOCATE");
        System.out.println();
        System.out.println("INTRODUCTION");
        System.out.println("An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
        System.out.println("""
                Advocates (INFJs) may be the rarest personality type of all, but they certainly leave their mark on the world. Idealistic and principled, they aren’t content to coast through life – they want to stand up and make a difference.
                For Advocate personalities, success doesn’t come from money or status but from seeking fulfillment, helping others, and being a force for good in the world. While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers.\s
                People with this personality type care about integrity, and they’re rarely satisfied until they’ve done what they know to be right. Conscientious to the core, they move through life with a clear sense of their values, and they aim never to lose sight of what truly matters –\s
                not according to other people or society at large, but according to their own wisdom and intuition.
                
                Seeking Purpose
                Perhaps because their personality type is so uncommon, Advocates tend to carry around a sense – whether conscious or not – of being different from most people. With their rich inner lives and their deep, abiding desire to find their life purpose, they don’t always fit in with those around them.\s
                This isn’t to say that Advocates can’t enjoy social acceptance or close relationships – only that they sometimes feel misunderstood or at odds with the world. Fortunately, this sense of being out of step doesn’t diminish Advocates’ commitment to making the world a better place.\s
                Advocates are troubled by injustice, and they typically care more about altruism than personal gain. They often feel called to use their strengths – including creativity, imagination, and sensitivity – to uplift others and spread compassion.
                Nothing lights up Advocates like changing someone else’s life for the better. Many Advocates see helping others as their mission in life, and they’re always looking for ways to step in and speak up for what is right.\s
                People with this personality type also aspire to fix society’s deeper problems, in the hope that unfairness and hardship can become things of the past. At times, however, Advocates may focus so intently on their ideals that they don’t take adequate care of themselves – a pattern that can lead to stress and burnout.
                
                Connecting with Others (and Themselves)
                Advocates may be Introverted, but they value deep, authentic relationships with others. Few things bring these personalities as much joy as truly knowing another person – and being known in return. Advocates enjoy meaningful conversations far more than small talk, and they tend to communicate in a way that is warm and sensitive.\s
                This emotional honesty and insight can make a powerful impression on the people around them. A few close relationships, provided that they’re genuine, can fill Advocates’ hearts to the brim. Thoughtful and compassionate, Advocates pour a great deal of energy and care into their relationships.
                This doesn’t mean that they always feel appreciated in return. Advocates tend to act with great thought and care, and it can frustrate them when other people don’t recognize their good intentions. As a result, even constructive criticism may feel incredibly personal or hurtful to these personalities.
                
                A Personal Mission
                Many Advocates feel that their life has a unique purpose – a mission that they were put onto this earth to fulfill. For people with this personality type, one of the most rewarding aspects of life is seeking out this purpose – and then, once they’ve found it, striving to do it justice.
                When Advocates encounter inequity or unfairness, they rarely give up – instead, they consult their intuition and their compassion to find a solution. With their innate ability to balance the heart with the head, Advocates are hardwired to right the wrongs of the world, no matter how big or small.\s
                These personalities just need to remember that while they’re busy taking care of everyone else, they need to pause sometimes and take care of themselves as well.""");
        return false;
    }


    public boolean INFP() {
        System.out.println("MEDIATOR");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.");
        System.out.println("""
                Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their minds.
                These personalities are known for their sensitivity – Mediators can have profound emotional responses to music, art, nature, and the people around them. Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others.\s
                But because this personality type makes up such a small portion of the population, Mediators may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.
                
                The Gift of Empathy
                Mediators share a sincere curiosity about the depths of human nature. Introspective to the core, they’re exquisitely attuned to their own thoughts and feelings, but they yearn to understand the people around them as well.\s
                Mediators are compassionate and nonjudgmental, always willing to hear another person’s story. When someone opens up to them or turns to them for comfort, they feel honored to listen and be of help.
                For Mediators, an ideal relationship of any kind is one in which both people feel comfortable sharing not just their wildest hopes and dreams but also their secret fears and vulnerabilities.
                Empathy is among this personality type’s greatest gifts, but at times it can be a liability. The troubles of the world weigh heavily on Mediators’ shoulders, and these personalities can be vulnerable to internalizing other people’s negative moods or mindsets.\s
                Unless they learn to set boundaries, Mediators may feel overwhelmed by just how many wrongs there are that need to be set right.
                
                Speaking Their Truth
                Few things make Mediators more uneasy than pretending to be someone they aren’t. With their sensitivity and their commitment to authenticity, people with this personality type tend to crave opportunities for creative self-expression.\s
                It comes as no surprise, then, that many famous Mediators are poets, writers, actors, and artists. They can’t help but muse about the meaning and purpose of life, dreaming up all sorts of stories, ideas, and possibilities along the way.
                Mediators have a talent for self-expression. They may reveal their innermost thoughts and secrets through metaphors and fictional characters. Through these imaginative landscapes, Mediators can explore their own inner nature as well as their place in the world.\s
                While this is a beautiful trait, these personalities sometimes show a tendency to daydream and fantasize rather than take action. To avoid feeling frustrated, unfulfilled, or incapable, Mediators need to make sure that they take steps to turn their dreams and ideas into reality.

                In Search of a Calling
                People with this personality type tend to feel directionless or stuck until they connect with a sense of purpose for their lives. For many Mediators, this purpose has something to do with uplifting others and their ability to feel other people’s suffering as if it were their own.\s
                While Mediators want to help everyone, they need to focus their energy and efforts – otherwise, they can end up exhausted. Fortunately, like flowers in the spring, Mediators’ creativity and idealism can bloom even after the darkest of seasons.\s
                Although they know the world will never be perfect, Mediators still care about making it better however they can. This quiet belief in doing the right thing may explain why these personalities so often inspire compassion, kindness, and beauty wherever they go.
                """);
        return false;
    }


    public boolean ENFJ() {
        System.out.println("PROTAGONIST");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.\n");
        System.out.println("""
                Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic, these personality types strive to have a positive impact on other people and the world around them. They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                Protagonist (ENFJ) personality
                Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships.\s
                Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.
                
                Speaking Up for What’s Right
                Protagonists tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak in ways that resonate with others.
                These personality types have an uncanny ability to pick up on people’s underlying motivations and beliefs. At times, they may not even understand how they come to grasp another person’s mind and heart so quickly. These flashes of insight can make Protagonists incredibly persuasive and inspiring communicators.
                Changing people’s minds is no easy task – but if anyone can do it, it’s Protagonists. Protagonists’ secret weapon is their purity of intent. Generally speaking, they are motivated by a sincere wish to do the right thing rather than a desire to manipulate or have power over other people.\s
                Even when they disagree with someone, Protagonists search for common ground. The result is that people with this personality type can communicate with an eloquence and sensitivity that are nearly impossible to ignore – particularly when they speak about matters that are close to their hearts.
                
                Getting Involved
                When Protagonists care about someone, they want to help solve that person’s problems – sometimes at any cost. The good news is that many people are grateful for Protagonists’ assistance and advice. After all, there’s a reason that these personalities have a reputation for helping others improve their lives.
                Protagonists are genuine, caring people who talk the talk and walk the walk. Nothing makes them happier than motivating other people to do what’s right. But getting involved in other people’s problems isn’t always a recipe for success.\s
                Protagonists tend to have a clear vision of what people can or should do in order to better themselves, but not everyone is ready to make those changes. If Protagonists push too hard, their loved ones may feel resentful or unfairly judged.\s
                And while this personality type is known for being insightful, even the wisest Protagonists may sometimes misread a situation or unwittingly give bad advice.
                
                Leading the Way
                People with this personality type are devoted altruists, ready to face slings and arrows in order to stand up for the people and ideas that they believe in. This strength of conviction bolsters Protagonists’ innate leadership skills, particularly their ability to guide people to work together in service of the greater good.
                But their greatest gift might actually be leading by example. In their day-to-day lives, Protagonists reveal how seemingly ordinary situations can be handled with compassion, dedication, and care.\s
                For these personalities, even the smallest daily choices and actions – from how they spend their weekend to what they say to a coworker who is struggling – can become an opportunity to lead the way to a brighter future.""");
        return false;
    }

    public boolean ENFP() {
        System.out.println("CAMPAIGNER");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.\n");

        System.out.println("""
                Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. But even though they can be the life of the party, Campaigners don’t just care about having a good time.\s
                These personality types run deep – as does their longing for meaningful, emotional connections with other people.
                
                The Magic of Everyday Life
                Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives. But beneath their sociable, easygoing exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity, a Campaigner simply wouldn’t be a Campaigner.
                In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life – even when they should be paying attention to something else.\040
                These personalities believe that everything – and everyone – is connected, and they live for the glimmers of insight that they can gain into these connections.
                Campaigners are independent and creative, always on the lookout for the magic and meaning in everyday life.
                When something sparks their imagination, Campaigners can show an enthusiasm that is nothing short of infectious. These personalities radiate a positive energy that draws in other people, and Campaigners may find themselves being held up by their peers as a leader or guru.\040
                But once the initial bloom of inspiration wears off, Campaigners can struggle with self-discipline and consistency, losing steam on projects that once meant so much to them.

                Seeking Joy
                Campaigners are proof that seeking out life’s joys and pleasures isn’t the same as being shallow. Seemingly in the blink of an eye, people with this personality type can transform from impassioned idealists to carefree figures on the dance floor.
                Campaigner personalities are capable of intense thought and feeling – and also of kicking back and having a good time.
                Even in moments of fun, Campaigners want to connect emotionally with others. Few things matter more to these personality types than having genuine, heartfelt conversations with the people they cherish.\040
                Campaigners believe that everyone deserves to express their feelings, and their empathy and warmth create spaces where even the most timid spirits can feel comfortable opening up.
                People with this personality type need to be careful, however. Campaigners’ intuition may lead them to read far too much into other people’s actions and behaviors. Instead of simply asking for an explanation, Campaigners may end up puzzling over someone else’s desires or intentions.\040
                This kind of social stress is what keeps harmony-focused Campaigners awake at night.
                Campaigners will spend a lot of time exploring different relationships, feelings, and ideas before they find a path for their lives that feels right. But when they finally do find their way, their imagination, empathy, and courage can light up not only their own lives but also the world around them.""");

        return false;
    }



    public boolean ISTJ() {
        System.out.println("LOGISTICIAN");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.\n");
        System.out.println("""
                Logisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something, they make sure to follow through.
                This personality type makes up a good portion of the overall population, and while Logisticians may not be particularly flashy or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation.\s
                In their families and their communities, Logisticians often earn respect for their reliability, their practicality, and their ability to stay grounded and logical, even in the most stressful situations.
                In a world where many people shirk their responsibilities or say what they think others want to hear, Logisticians stand out as dedicated, responsible, and honest.
                
                A Life of Integrity
                The core of Logisticians’ self-respect comes from a sense of personal integrity. People with this personality type believe that there is a right way to proceed in any situation – and that anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes.\s
                Logisticians have a deep respect for structure and tradition, and they are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and expectations.
                For many Logisticians, a lack of structure offers not freedom, but chaos. People with the Logistician personality type rarely hesitate to take responsibility for their actions and choices.\s
                Generally speaking, they are quick to own up to their own mistakes, admitting the truth even if it doesn’t make them look good. To Logisticians, honesty is far more important than showmanship, and they’d rather satisfy their own conscience than lie to impress someone else.
                Because they strive to meet their obligations no matter what, Logistician personalities are often baffled by people who fail to hold themselves to the same standard.\s
                At times, Logisticians might unfairly misjudge people who can’t match their rigorous self-control – suspecting that someone is being lazy or dishonest when that person might actually be coping with other challenges.\s
                Even if Logisticians don’t speak these judgments aloud, their disdain can come through regardless, earning them a reputation for being somewhat strict or unempathetic.
                
                Picking Up the Slack
                Logisticians’ dedication is an admirable quality, and it drives many of their accomplishments. But it can also become a weakness that other people take advantage of. With their strong work ethic and sense of duty, Logisticians may routinely find themselves shouldering other people’s responsibilities.\s
                Even if they don’t complain about the situation, Logisticians can end up exhausted or discouraged if they’re constantly expected – or taking it upon themselves – to pick up the slack for their colleagues, friends, or loved ones.
                Logisticians may find themselves doing other people’s work – and not getting credit for it. Logisticians aren’t known for expressing their emotions readily, but that doesn’t mean that people with this personality type don’t feel frustration or resentment when they’re pulling more than their weight.\s
                And unless they make sure that their relationships are balanced and sustainable, Logisticians may end up compromising the very stability that they feel called to protect. The good news is that, by learning to set appropriate boundaries and speak up when they’re overstretched, Logisticians can offer the world the full benefit of their many gifts, including their clarity, their loyalty, and their dependability.""");

        return false;
    }



    public boolean ISFJ() {
        System.out.println("DEFENDER");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.");
        System.out.println("""
                In their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted, people with this personality type feel a deep sense of responsibility to those around them. Defenders can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring, Defenders also have excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships. Defenders are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                Defenders are true altruists, meeting kindness with kindness-in-excess and engaging with the work and people they believe in with enthusiasm and generosity.
                
                The Gift of Loyalty
                Among Defenders’ most distinctive traits is loyalty. Rare is the Defender who allows a friendship or relationship to fade away from lack of effort. Instead, they invest a great deal of energy into maintaining strong connections with their loved ones – and not just by sending “How are you doing?” texts. People with this personality type are known for dropping everything and lending a hand whenever a friend or family member is going through a hard time.
                Defenders tend to feel most energized and effective when they’re showing up for someone who needs their help. Defenders’ sense of loyalty doesn’t stop with their nearest and dearest – it often extends to their communities, their employers, and even family traditions. But the intensity of their commitment and desire to serve can have its downsides.\s
                Other people may take advantage of Defenders’ helpful, hardworking nature, leaving them feeling burned out and overworked. And Defenders may feel guilty or stressed when they contemplate changes – even necessary changes – to themselves, their relationships, or the way they’ve done things in the past.
                
                The Highest of Standards
                For Defenders, “good enough” is rarely good enough. People with this personality type can be meticulous to the point of perfectionism. They take their responsibilities personally, consistently going above and beyond and doing everything that they can to exceed others’ expectations.
                Defender personalities are known for their humility, and they rarely seek the spotlight.
                But what happens when Defenders’ efforts go unnoticed or unappreciated? While Defenders tend to underplay their accomplishments, that doesn’t mean that they don’t enjoy recognition – or that they’re fine with being taken for granted. Unless they learn to stand up for themselves, Defenders may find themselves quietly losing their enthusiasm and motivation, eventually becoming resentful toward the people who just don’t seem to appreciate them.
                Showing Up for Others – and Themselves
                Although they’re Introverted, Defenders have a deeply social nature. Thanks to their ability to remember the details of other people’s lives, Defenders have a special talent for making their friends and acquaintances feel seen, known, and cherished. Few personality types can match Defenders’ ability to choose just the right gift for any occasion, whether large or small.
                Dedicated and thoughtful, Defenders find great joy in helping those around them build stable, secure, and happy lives. It may not be easy for people with this personality type to show up for themselves in the way that they show up for other people, but when they do, they often find themselves with even more energy and motivation to do good in the world.
                """);

        return false;
    }



    public boolean ESTJ() {
        System.out.println("EXECUTIVE");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.");
        System.out.println("""
                Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they happily lead the way on difficult paths.\s
                Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to bring everyone together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together.
                
                Leading by Example
                Demand for such leadership is high in democratic societies, and forming no less than 11% of the population, it’s no wonder that many of America’s presidents have been Executives. Strong believers in the rule of law and authority that must be earned, Executive personalities lead by example, demonstrating dedication and purposeful honesty, and an utter rejection of laziness and cheating, especially in work.\s
                If anyone declares hard, manual work to be an excellent way to build character, it is Executives. Executives are aware of their surroundings and live in a world of clear, verifiable facts – the surety of their knowledge means that even against heavy resistance, they stick to their principles and push an unclouded vision of what is and is not acceptable.\s
                Their opinions aren’t just empty talk either, as Executives are more than willing to dive into the most challenging projects, improving action plans and sorting details along the way, making even the most complicated tasks seem easy and approachable.
                However, Executives don’t work alone, and they expect their reliability and work ethic to be reciprocated – people with this personality type meet their promises, and if partners or subordinates jeopardize them through incompetence or laziness, or worse still, dishonesty, they do not hesitate to show their wrath.\s
                This can earn them a reputation for inflexibility, a trait shared by all Sentinel personalities, but it’s not because Executives are arbitrarily stubborn, but because they truly believe that these values are what make society work.
                
                A Greater Responsibility
                Executives are classic images of the model citizen: they help their neighbors, uphold the law, and try to make sure that everyone participates in the communities and organizations they hold so dear.
                The main challenge for Executives is to recognize that not everyone follows the same path or contributes in the same way. A true leader recognizes the strength of the individual, as well as that of the group, and helps bring those individuals’ ideas to the table. That way, Executives really do have all the facts, and are able to lead the charge in directions that work for everyone.""");

        return false;
    }


    public boolean ESFJ() {
        System.out.println("CONSUL");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.");
        System.out.println("""
                For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.
                This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them.\s
                Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together.
                Consuls have a talent for making the people in their lives feel supported, cared for, and secure.
                
                The Beauty of a Responsible Life
                Consuls are altruists. They take seriously their responsibilities to give back, serve others, and do the right thing. And Consuls believe that there is a clear right thing to do in nearly every situation.\s
                While some personality types adopt a more lenient, live-and-let-live attitude, Consuls may find it difficult not to judge when someone takes a path that strikes them as misguided. As a result, Consuls often struggle to accept it when someone – particularly someone they care about – disagrees with them.
                Consuls have a clear moral compass – and it can be nothing short of baffling to them when other people’s actions don’t align with it. With their definite views on right and wrong, Consuls tend to be on the opinionated side. But these opinions aren’t arbitrary – they’re often based on a deep respect for tradition.\s
                Consuls know that everything they do affects someone else, and they trust that established laws, protocols, and social norms will help them navigate their everyday lives in a way that is considerate and responsible toward others.
                
                Building Relationships That Last
                Supportive and outgoing, Consuls can always be spotted at a party – they’re the ones fluttering around making sure that everyone else is having a good time! But make no mistake: Consuls don’t just breeze through other people’s lives. Loyal to the core, they build lasting relationships, and they can be counted on to show up whenever a helping hand – or a listening ear – is needed.
                Consuls rarely miss a birthday or holiday. Devoted to their relationships, they commit even the smallest details of their friends’ and loved ones’ lives to memory. With their love of order and structure, Consuls prefer planned events to open-ended activities or spontaneous get-togethers – and they’re happy to host in order to ensure that everything goes smoothly.\s
                People with this personality type put a great deal of energy into making other people feel special and celebrated, and they may take it personally when someone doesn’t seem to appreciate their efforts.
                For many people with the Consul personality type, one of life’s greatest challenges is accepting that they can’t control anyone else’s thoughts or behavior – not even those who are nearest and dearest to them. Fortunately, Consuls can find peace and fulfillment by focusing on what they do best: setting an example of care, consideration, and responsibility – and bringing people together in the process.""");

        return false;
    }



    public boolean ISTP() {
        System.out.println("VIRTUOSO");
        System.out.println();
        System.out.println("INTRODUCTION");
        System.out.println("""
                Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity. People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and learning from their environment as they go.\s
                Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty pulling things apart and putting them back together, just a little bit better than they were before. Virtuosos explore ideas through creating, troubleshooting, trial and error and first-hand experience. They enjoy having other people take an interest in their projects and sometimes don’t even mind them getting into their space.\s
                Of course, that’s on the condition that those people don’t interfere with Virtuosos’ principles and freedom, and they’ll need to be open to Virtuosos returning the interest in kind. Virtuosos enjoy lending a hand and sharing their experience, especially with the people they care about, and it’s a shame they’re so uncommon, making up only about five percent of the population.\s
                Virtuoso women are especially rare, and the typical gender roles that society tends to expect can be a poor fit – they’ll often be seen as tomboys from a young age.
                
                Dare to Differ
                While their mechanical tendencies can make them appear simple at a glance, Virtuosos are actually quite enigmatic. Friendly but very private, calm but suddenly spontaneous, extremely curious but unable to stay focused on formal studies, Virtuoso personalities can be a challenge to predict, even by their friends and loved ones.\s
                Virtuosos can seem very loyal and steady for a while, but they tend to build up a store of impulsive energy that explodes without warning, taking their interests in bold new directions. Rather than some sort of vision quest though, Virtuosos are merely exploring the viability of a new interest when they make these seismic shifts.
                Virtuosos’ decisions stem from a sense of practical realism, and at their heart is a strong sense of direct fairness, a “do unto others” attitude, which really helps to explain many of Virtuosos’ puzzling traits. Instead of being overly cautious though, avoiding stepping on toes in order to avoid having their toes stepped on, Virtuosos are likely to go too far, accepting likewise retaliation, good or bad, as fair play.
                The biggest issue Virtuosos are likely to face is that they often act too soon, taking for granted their permissive nature and assuming that others are the same. They’ll be the first to tell an insensitive joke, get overly involved in someone else’s project, roughhouse and play around, or suddenly change their plans because something more interesting came up.
                
                Defying the Rules
                Virtuosos will come to learn that many other personality types have much more firmly drawn lines on rules and acceptable behavior than they do – they don’t want to hear an insensitive joke, and certainly wouldn’t tell one back, and they wouldn’t want to engage in horseplay, even with a willing party. If a situation is already emotionally charged, violating these boundaries can backfire tremendously.
                Virtuosos have a particular difficulty in predicting emotions, but this is just a natural extension of their fairness, given how difficult it is to gauge Virtuosos’ emotions and motivations. However, their tendency to explore their relationships through their actions rather than through empathy can lead to some very frustrating situations.\s
                People with the Virtuoso personality type struggle with boundaries and guidelines, preferring the freedom to move about and color outside the lines if they need to. Finding an environment where they can work with good friends who understand their style and unpredictability, combining their creativity, sense of humor and hands-on approach to build practical solutions and things, will give Virtuosos many happy years of building useful boxes – and admiring them from the outside.""");

        return false;
    }


    public boolean ISFP() {
        System.out.println("ADVENTURER");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.\n");
        System.out.println("""
                Adventurers are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas for self-expression. From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals.
                And every Adventurer is certainly unique. Driven by curiosity and eager to try new things, people with this personality often have a fascinating array of passions and interests. With their exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the most interesting people you’ll ever meet.
                The only irony? Unassuming and humble, Adventurers tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
                
                The Beauty of an Open Mind
                Adventurers embrace a flexible, adaptable approach to life. Some personality types thrive on strict schedules and routines – but not Adventurers. Adventurers take each day as it comes, doing what feels right to them in the moment.\s
                And they make sure to leave plenty of room in their lives for the unexpected – with the result that many of their most cherished memories are of spontaneous, spur-of-the-moment outings and adventures, whether by themselves or with their loved ones.
                This flexible mindset makes Adventurers remarkably tolerant and open-minded. These personalities genuinely love living in a world filled with all kinds of people – even people who disagree with them or choose radically different lifestyles.
                It’s no surprise, then, that Adventurers are unusually open to changing their minds and rethinking their opinions. If any personality type believes in giving something (or someone) a second chance, it’s Adventurers.
                Adventurers want to live in a world where they – and everyone else – have the freedom to live as they see fit, without judgment. That said, Adventurers’ go-with-the-flow mentality can have its downsides. People with this personality type may struggle to set long-term plans – let alone stick with them.
                As a result, Adventurers tend to have a pretty cloudy view of their ability to achieve their goals, and they often worry about letting other people down. Adventurers may find that adding a little structure to their lives goes a long way toward helping them feel more capable and organized – without quashing their independent spirits.
                
                Living in Harmony
                In their relationships, Adventurers are warm, friendly, and caring, taking wholehearted enjoyment in the company of their nearest and dearest. But make no mistake: this is an Introverted personality type, meaning that Adventurers need dedicated alone time to recharge their energy after socializing with others.\s
                This alone time is what allows Adventurers to reestablish a sense of their own identity – in other words, to reconnect with who they truly are. Unless they take time for themselves, Adventurers can end up feeling lost in the tide of everyday life, constantly reacting to external circumstances instead of making their own way.
                Creative and free-spirited, Adventurers march to the beat of their own drum, and it would be easy to assume that they don’t particularly worry what other people think of them. But this isn’t the case – Adventurers are thoughtful and perceptive, able to pick up on people’s unspoken feelings and opinions, and it can upset them if they don’t feel liked, approved of, or appreciated.\s
                When faced with criticism, it can be a challenge for people with this personality type not to get caught up in the heat of the moment. If they encounter harsh or seemingly unfair criticism, they may even lose their tempers in spectacular fashion.
                But there’s good news, too: Adventurers live in the present, and they know that they don’t need to dwell on past hurts or frustrations. Rather than focusing on how things could be different, people with this personality type have an incredible capacity for appreciating what’s right about life just as it is.\s
                Everywhere they look, Adventurers can find sources of beauty and enjoyment that other people might miss – and this perspective is just one of the many gifts that they share with the world.""");
        return false;
    }



    public boolean ESTP() {
        System.out.println("ENTREPRENEUR");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.\n");
        System.out.println("""
                Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group. Laughing and entertaining with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention.
                If an audience member is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend. Theory, abstract concepts and plodding discussions about global issues and their implications don’t keep Entrepreneurs interested for long. Entrepreneurs keep their conversation energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it.\s
                Entrepreneurs leap before they look, fixing their mistakes as they go, rather than sitting idle, preparing contingencies and escape clauses.
                
                Diving Right In
                Entrepreneurs are the likeliest personality type to make a lifestyle of risky behavior. They live in the moment and dive into the action – they are the eye of the storm. People with the Entrepreneur personality type enjoy drama, passion, and pleasure, not for emotional thrills, but because it’s so stimulating to their logical minds. They are forced to make critical decisions based on factual, immediate reality in a process of rapid-fire rational stimulus response.
                This makes school and other highly organized environments a challenge for Entrepreneurs. It certainly isn’t because they aren’t smart, and they can do well, but the regimented, lecturing approach of formal education is just so far from the hands-on learning that Entrepreneurs enjoy. It takes a great deal of maturity to see this process as a necessary means to an end, something that creates more exciting opportunities.
                Also challenging is that to Entrepreneurs, it makes more sense to use their own moral compass than someone else’s. Rules were made to be broken. This is a sentiment few high school instructors or corporate supervisors are likely to share, and can earn Entrepreneur personalities a certain reputation. But if they minimize the trouble-making, harness their energy, and focus through the boring stuff, Entrepreneurs are a force to be reckoned with.
                
                The Path Less Traveled
                With perhaps the most perceptive, unfiltered view of any type, Entrepreneurs have a unique skill in noticing small changes. Whether a shift in facial expression, a new clothing style, or a broken habit, people with this personality type pick up on hidden thoughts and motives where most types would be lucky to pick up anything specific at all. Entrepreneurs use these observations immediately, calling out the change and asking questions, often with little regard for sensitivity.\s
                Entrepreneurs should remember that not everyone wants their secrets and decisions broadcast. Sometimes Entrepreneurs’ instantaneous observation and action is just what’s required, as in some corporate environments, and especially in emergencies. If Entrepreneurs aren’t careful though, they may get too caught in the moment, take things too far, and run roughshod over more sensitive people, or forget to take care of their own health and safety.\s
                Making up only four percent of the population, there are just enough Entrepreneurs out there to keep things spicy and competitive, and not so many as to cause a systemic risk. Entrepreneurs are full of passion and energy, complemented by a rational, if sometimes distracted, mind. Inspiring, convincing and colorful, they are natural group leaders, pulling everyone along the path less traveled, bringing life and excitement everywhere they go.\s
                Putting these qualities to a constructive and rewarding end is Entrepreneurs’ true challenge.
                """);
        return false;
    }

    public boolean ESFP() {
        System.out.println("ENTERTAINER");
        System.out.println();
        System.out.println("INTRODUCTION\n" +
                "An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.");
        System.out.println("""
                If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type. Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other personality type is as generous with their time and energy as Entertainers when it comes to encouraging others, and no other personality type does it with such irresistible style.
                
                Living with Passion
                Entertainers love the spotlight, and all the world’s a stage. Many famous people with the Entertainer personality type are indeed actors, but they love putting on a show for their friends too, chatting with a unique and earthy wit, soaking up attention and making every outing feel a bit like a party. Utterly social, Entertainers enjoy the simplest things, and there’s no greater joy for them than just having fun with a good group of friends.
                It’s not just talk either – Entertainers have the strongest aesthetic sense of any personality type. From grooming and outfits to a well-appointed home, Entertainer personalities have an eye for fashion. Knowing what’s attractive the moment they see it, Entertainers aren’t afraid to change their surroundings to reflect their personal style. Entertainers are naturally curious, exploring new designs and styles with ease.
                Though it may not always seem like it, Entertainers know that it’s not all about them – they are observant, and very sensitive to others’ emotions. People with this personality type are often the first to help someone talk out a challenging problem, happily providing emotional support and practical advice. However, if the problem is about them, Entertainers are more likely to avoid a conflict altogether than to address it head-on.\s
                Entertainers usually love a little drama and passion, but not so much when they are the focus of the criticisms it can bring.
                
                A Spontaneous Spirit
                The biggest challenge Entertainers face is that they are often so focused on immediate pleasures that they neglect the duties and responsibilities that make those luxuries possible. Complex analysis, repetitive tasks, and matching statistics to real consequences are not easy activities for Entertainers. They’d rather rely on luck or opportunity, or simply ask for help from their extensive circle of friends.\s
                It is important for Entertainers to challenge themselves to keep track of long-term things like their retirement plans or sugar intake – there won’t always be someone else around who can help to keep an eye on these things.
                Entertainers recognize value and quality, which on its own is a fine trait. In combination with their tendency to be poor planners though, this can cause them to live beyond their means, and credit cards are especially dangerous. More focused on leaping at opportunities than in planning out long-term goals, Entertainers may find that their inattentiveness has made some activities unaffordable.
                There’s nothing that makes Entertainers feel quite as unhappy as realizing that they are boxed in by circumstance, unable to join their friends. Entertainers are welcome wherever there’s a need for laughter, playfulness, and a volunteer to try something new and fun – and there’s no greater joy for Entertainer personalities than to bring everyone else along for the ride.\s
                Entertainers can chat for hours, sometimes about anything but the topic they meant to talk about, and share their loved ones’ emotions through good times and bad. If they can just remember to keep their ducks in a row, they’ll always be ready to dive into all the new and exciting things the world has to offer, friends in tow.""");

        return false;
    }
    }