package com.example.technews

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

       val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val adapter = ArticlesAdapter(getArticles())
        recyclerView.adapter=adapter
        val manager= LinearLayoutManager(this)
        recyclerView.layoutManager= manager


    }


}
fun getArticles(): List<Article> {
    val articles = ArrayList<Article>()
    articles.add(Article(
        "Tesla is unveiling its long-awaited robotaxi amid doubts about the technology it runs on",
        "October 11, 2024",
        R.drawable.tesla,
        "Automobiles",
        "LOS ANGELES (AP) — Tesla unveiled its long-awaited robotaxi at a Hollywood studio Thursday night, though fans of the electric vehicle maker will have to wait until at least 2026 before they are available.\n" +
                "\n" +
                "CEO Elon Musk pulled up to a stage at the Warner Bros. studio lot in one of the company’s “Cybercabs,” telling the crowd that the sleek, AI-powered vehicles don’t have steering wheels or pedals. He also expressed confidence in the progress the company has made on autonomous driving technology that makes it possible for vehicles to drive without human intervention.\n" +
                "\n" +
                "Tesla began selling the software, which is called “Full Self-Driving,” nine years ago. But there are doubts about its reliability.\n" +
                "\n" +
                "“We’ll move from supervised Full Self-Driving to unsupervised Full Self-Driving. where you can fall asleep and wake up at your destination,” he said. “It’s going to be a glorious future.”\n" +
                "\n" +
                "Tesla expects the Cybercabs to cost under \$30,000, Musk said. He estimated that the vehicles would become available in 2026, then added “before 2027.”\n" +
                "\n" +
                "The company also expects to make the Full Self-Driving technology available on its popular Model 3 and Model Y vehicles in Texas and California next year. "
    ))
    articles.add(Article(
        "AMD likely to launch new AI chips at San Francisco data center event",
        "October 10, 2024",
        R.drawable.amd,
        "Artificial Intelligence",
        "SAN FRANCISCO, Oct 10 (Reuters) - Advanced Micro Devices said on Thursday it plans to start mass production of a new version of its artificial-intelligence chip called the MI325X in the fourth quarter of the year, as it seeks to bolster its presence in a market dominated by Nvidia.\n" +
                "At an event in San Francisco, AMD (AMD.O)\n" +
                ", opens new tab CEO Lisa Su said the company plans to release its next-generation MI350 series chips in the second half of 2025. These chips include an increased amount of memory and will boast a new underlying architecture that AMD said will improve performance significantly over the prior MI300X and MI250X chips.\n" +
                "The announcements were broadly expected based on AMD disclosures earlier this year. They failed to cheer investors, who sent AMD shares down nearly 5% in afternoon trading. Some analysts attributed the fall to the absence of large new cloud-computing customers for the chips.\n" +
                "Shares of rival Nvidia were up 1.5% while Intel (INTC.O)\n" +
                ", opens new tab fell 1.6%.\n" +
                "Demand for AI processors from major technology firms such as Microsoft (MSFT.O)\n" +
                ", opens new tab and Meta Platforms (META.O)\n" +
                ", opens new tab has been far outpacing supply from Nvidia and AMD, allowing the semiconductor companies to sell as much as they can produce.\n" +
                "That has driven a massive rally in chip stocks over the past two years, with AMD's shares up about 30% since a recent low in early August."
    ))
    articles.add(Article(
        "US charges 3 companies, 15 people with cryptocurrency fraud",
        "October 2, 2024",
        R.drawable.ethereum,
        "Legal",
        "BOSTON, Oct 9 (Reuters) - Three cryptocurrency companies and 15 people have been charged with engaging in widespread fraud and market manipulation following an investigation in which the FBI for the first time directed the creation of a new digital token to help authorities ferret out crime.\n" +
                "Federal prosecutors in Boston charged the firms Gotbit, ZM Quant, CLS Global and the leaders and employees of those and other companies in a takedown that has led to four arrests, agreements by five people to plead guilty and the seizure of over \$25 million worth of cryptocurrency.\n" +
                "Acting U.S. Attorney Joshua Levy said the defendants engaged in sham trades to artificially inflate the trading volume of various cryptocurrency tokens before selling them off, \"leaving innocent investors holding the bag.\"\n" +
                "\"This is a case where new age technology, crypto, meets an old school fraud, in this case a 'pump and dump' scheme, which is as old as the stock markets,\" Levy told reporters.\n" +
                "As part of the investigation, the FBI directed the creation of a cryptocurrency company, NexFundAI, which had a token on the Ethereum blockchain that prosecutors said ZM Quant, CLS Global and another company, MyTrade, agreed to help manipulate.\n" +
                "Authorities said that token was traded but that they carefully monitored to minimize the risk retail investors might buy it before disabling trading. The U.S. Securities and Exchange Commission filed related civil cases as well.\n" +
                "Prosecutors said that Saitama, the largest of the companies involved, at one point had a market value of \$7.5 billion, after its leadership began manipulating trading of its tokens and secretly sold them.\n" +
                "Its chief executive, Manpreet Kohli\n" +
                ", opens new tab, was arrested on Monday in the United Kingdom. Five other current or former employees were also charged, and three have pleaded guilty.\n" +
                "Others charged\n" +
                ", opens new tab were Aleksei Andriunin, CEO of Gotbit, a cryptocurrency \"market maker\" who lived in Russia and Portugal. He was arrested in Portugal on Tuesday. Two of his company's employees in Russia were also charged.\n" +
                "Prosecutors said that from 2018 to 2024, Gotbit engaged in \"wash trading,\" a form of sham trading, and market manipulation on behalf of several cryptocurrency clients to help artificially inflate trading volume for their tokens.\n" +
                "Also charged were four other individuals who worked at cryptocurrency \"market makers\" that prosecutors said advertised market manipulation services to clients.\n" +
                "They are Liu Zhou, the founder of market maker MyTrade, who according to court papers has agreed to plead guilty; Riqui Liu of the United Kingdom and Hong Kong and Baijun Ou of Hong Kong, who both worked at ZM Quant; and Andrey Zhorzhes of the United Arab Emirates, an employee of CLS Global.\n" +
                "They could not be immediately reached for comment.\n" +
                "Others charged were Michael Thompson of Virginia, who worked at a cryptocurrency company called VZZN founded by a former Saitama employee, and Bradley Beatty of Florida, who prosecutors said fraudulently promoted his crypto company, Lillian Finance.\n" +
                "\n"
    ))

    articles.add(Article(
        "India's Star Health probes alleged role of security chief in data leak",
        "October 2, 2024",
        R.drawable.cyber,
        "CyberSecurity",
        "NEW DELHI, Oct 10 (Reuters) - India's Star Health is investigating accusations that its chief information security officer played a role in a data leak by a self-styled hacker who used Telegram chatbots and websites to disseminate customers' medical records and personal data.\n" +
                "The country's biggest health insurer, Star told Reuters that the official, Amarjeet Khanuja, was co-operating in its investigation into the leak, which has so far turned up no evidence of wrongdoing by him.\n" +
                "The investigation comes after the hacker, an individual dubbed xenZen, publicly asserted on his website that the executive had \"sold all this data to me\".\n" +
                "Khanuja, the firm's chief information security officer (CISO), did not respond to a request for comment.\n" +
                "\"Our CISO has been duly co-operating in the investigation and we have not arrived at any finding of wrongdoing by him till date,\" Star said in Wednesday's statement.\n" +
                "Last month Star Health (STAU.NS)\n" +
                ", opens new tab sued Telegram and the hacker after Reuters reported on Sept. 20 that the hacker used chatbots on the messaging app to leak customer details, before setting up websites providing easy access to the data.\n" +
                "Star was trading down 2% on Thursday, and has lost about 6% since the Reuters report.\n" +
                "\"We were the victim of a targeted, malicious cyberattack, resulting in unauthorized and illegal access to certain data,\" Star said."
    ))
    articles.add(Article(
        "G7 pledges to tackle anti-competitive practices in chip industry",
        "October 10, 2024",
        R.drawable.chip,
        "Technology",
        "ROME, Oct 10 (Reuters) - Industry ministers from the Group of Seven advanced democracies agreed on Thursday that non-market practices in the semiconductor industry are an urgent issue to be addressed jointly, the Italian presidency said.\n" +
                "At the G7 summit in June, leaders had vowed to take action to address what they said were unfair business practices by China."
    ))
    articles.add(Article(
        "Healthcare startup Suki raises \$70 million to build AI assistants for hospitals",
        "October 9, 2024",
        R.drawable.ai,
        "Artificial Intelligence",
        "Oct 10 (Reuters) - Suki, a startup that offers to build artificial intelligence (AI) assistants in healthcare, has raised \$70 million in a Series D round, the company told Reuters, as investors place bets on the adoption of generative AI-powered applications in the sector.\n" +
                "The funding round was led by London-based tech investment firm Hedosophia, with additional investments from Venrock and March Capital. This brings Suki's total funding to \$165 million.\n" +
                "Redwood City, California-based Suki did not disclose its valuation, but a person familiar to the funding round said the latest proceeds valued the company at about \$500 million.\n" +
                "Founded in 2017 by former Google and Flipkart executive Punit Soni, Suki develops AI voice assistant to reduce the administrative workload for healthcare providers. Its primary products Suki Assistant and Suki Platform have seen increased adoption since the boom of OpenAI's ChatGPT, as healthcare systems across the country explore how the technology can better aid doctors' clinical work.\n" +
                "\"When the AI trend kicked in, every health system wanted to have an AI strategy,\" Soni said, adding that the company has built proprietary tech stack by being in the space early.\n" +
                "The company capitalized on the demand, saying it now has established partnerships with over 300 health systems such as St. Mary's Healthcare in New York. Suki also touts the broadest integration of Electronic Health Record systems (EHRs), working with Epic, Oracle-owned Cerner, Athena, as well as MEDITECH."
    ))
    articles.add(Article(
        "China plans to expand its space station with international partnerships",
        "October 6, 2024",
        R.drawable.chinaspace,
        "Space",
        "BEIJING - China's space agency revealed plans to add new modules to its Tiangong space station by 2026. The country seeks international cooperation for research and exploration, aiming to establish itself as a major player in space science, alongside NASA and the ESA."
    ))
    articles.add(Article(
        "US plan to break up Google's search dominance threatens profit engine, AI growth",
        "October 9, 2024",
        R.drawable.google,
        "Boards, Policy & Regulation",
        "Oct 9 (Reuters) - The U.S. Department of Justice's proposed remedies to break up Google's search dominance could weaken its main profit engine and stall its advances in artificial intelligence, even though a final outcome may be years away, analysts said.\n" +
                "The DOJ said on Tuesday it may ask a judge to force Google to divest parts of its business such as its Chrome browser and Android operating system, that the Alphabet-owned company (GOOGL.O)\n" +
                ", opens new tab used to maintain an illegal monopoly in online search.\n" +
                "It is only one of the many potential fixes prosecutors are considering.\n" +
                "Barring Google from collecting sensitive user data, requiring it to make search results and indexes available to rivals, letting websites opt out of their content being used to train AI products and making Google report to a \"court-appointed technical committee\" are also on the table.\n" +
                "Alphabet investors, who have seen several antitrust actions this year including a ruling on Monday ordering Google to open up its app store, sent shares 1.5% lower to \$161.86 at Wednesday's close, after the DOJ news."
    ))

    articles.add(Article(
        "Big Tech proposes power-rate terms in Ohio data-center fight",
        "October 11, 2024",
        R.drawable.w,
        "Technology",
        "Oct 9 (Reuters) - The U.S. Department of Justice's proposed remedies to break up Google's search dominance could weaken its main profit engine and stall its advances in artificial intelligence, even though a final outcome may be years away, analysts said.\n" +
                "NEW YORK, Oct 10 (Reuters) - Microsoft (MSFT.O), opens new tab, Alphabet (GOOGL.O), opens new tab, Meta (META.O), opens new tab, Amazon (AMZN.O)\n" +
                ", opens new tab, along with other companies, have proposed an alternative framework for how data centers pay for power in Ohio, according to documents filed with regulators on Thursday.\n" +
                "The companies had been fighting a proposal brought by utility AEP Ohio in May that would require data centers and cryptocurrency miners to provide pre-payments and other financial assurances for their massive energy needs. AEP said at the time it was overloaded with requests from those two groups.\n" +
                "A growing number of U.S. states are receiving an influx of power demand from data centers as Big Tech rushes to acquire large amounts of electricity to expand technology such as generative AI.\n" +
                "The Ohio dispute is among the regulatory battles underway that may set precedents for how the U.S. power industry will manage the fast-moving expansion of data centers and who will pay to accommodate their demand."
    ))



    articles.add(Article(
        "German cartel office ends proceedings against Meta",
        "October 9, 2024",
        R.drawable.meta,
        "Technology",
        "BERLIN, Oct 10 (Reuters) - German cartel authorities ended proceedings against Meta (META.O)\n" +
                ", opens new tab over how personal data is used after intensive discussions that led to the U.S. owner of Facebook and Instagram agreeing to take measures addressing the concerns, they said on Thursday.\n" +
                "\"The key point here is that using Facebook no longer requires consent to the unlimited collection and allocation of data to one's own user account, even if the data does not actually arise in the Facebook service,\" said cartel office president Andreas Mundt.\n" +
                "\n" +
                "The Technology Roundup newsletter brings the latest news and trends straight to your inbox. Sign up "
    ))

    return articles
}
