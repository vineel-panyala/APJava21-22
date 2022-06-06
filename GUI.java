import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GUI implements ActionListener {
	int count = 0;
	FortuneCookie fc;
	Horoscope h;
	Magic8Ball m8B;
	SpiritAnimal span;
	JFrame frame;
	JLabel label;
	
	JPanel panel;
	JButton fortCookBt;
	JButton horoscopeBt;
	JButton horoYearEnterBt;
	JTextField horoYearTF;
	String userYear;
	JButton horoZodEnterBt;
	JTextField horoZodTF;
	String userZodiac;
	JButton horoMonthEnterBt;
	JTextField horoMonthTF;
	String horoMonth;
	JLabel horoFortune;
	JButton magic8BallBt;
	JButton m8BRiddleEnterBt;
	JTextField m8BTF;
	String answer;
	String question;
	String[] answers;
	String[] questions;
	JTextField userQuestionTF;
	JButton userQuestionBt;
	int index;
	JButton spiritAnimalBt;
	JButton braveBt;
	JButton independentBt;
	JButton spiritualBt;
	JButton socialBt;
	JButton hateCatsBt;
	JButton loveCatsBt;
	JButton tigerBt;
	JButton lionBt;
	JButton bearBt;
	JButton eagleBt;
	JButton passiveAggBt;
	JButton indAggBt;
	JButton catBt;
	JButton whaleBt;
	JButton wolfBt;
	JButton wolverineBt;
	JButton drivingBt;
	JButton flyingBt;
	JButton turtleBt;
	JButton snakeBt;
	JButton owlBt;
	JButton swanBt;
	JButton swimBt;
	JButton runBt;
	JButton dolphinBt;
	JButton belugaBt;
	JButton beeBt;
	JButton antBt;
	JButton playAgainBt;
	JButton playAgainBt1;
	
	public GUI() {
		frame = new JFrame();
		frame.setBounds(frame.getX(), frame.getY(), 400, 1250);
		frame.setSize(10000,10000);
	
		horoscopeBt = new JButton("Your Horoscope");
		horoscopeBt.setBounds(500,500, 100,20);
		horoscopeBt.addActionListener(this);
		
		fortCookBt = new JButton("A Fortune Cookie");
		fortCookBt.addActionListener(this);
	
		magic8BallBt = new JButton("Ask us a question");
		magic8BallBt.addActionListener(this);
		
		spiritAnimalBt = new JButton("Spirit Animal");
		spiritAnimalBt.addActionListener(this);
		spiritAnimalBt.setVisible(true);
		
		braveBt = new JButton("Brave");
		braveBt.addActionListener(this);
		braveBt.setVisible(false);
		
		independentBt = new JButton("Independent");
		independentBt.addActionListener(this);
		independentBt.setVisible(false);
		
		spiritualBt = new JButton("Spiritual");
		spiritualBt.addActionListener(this);
		spiritualBt.setVisible(false);
		
		socialBt = new JButton("Social");
		socialBt.addActionListener(this);
		socialBt.setVisible(false);
		
		hateCatsBt = new JButton("Hate cats");
		hateCatsBt.addActionListener(this);
		hateCatsBt.setVisible(false);
		
		tigerBt = new JButton("Social");
		tigerBt.addActionListener(this);
		tigerBt.setVisible(false);
		
		lionBt = new JButton("Alone");
		lionBt.addActionListener(this);
		lionBt.setVisible(false);
		
		bearBt = new JButton("Follower");
		bearBt.addActionListener(this);
		bearBt.setVisible(false);
		
		eagleBt = new JButton("Leader");
		eagleBt.addActionListener(this);
		eagleBt.setVisible(false);
		
		loveCatsBt = new JButton("Love cats");
		loveCatsBt.addActionListener(this);
		loveCatsBt.setVisible(false);
		
		passiveAggBt = new JButton("Passive Aggressive");
		passiveAggBt.addActionListener(this);
		passiveAggBt.setVisible(false);
		
		indAggBt = new JButton("Outright Aggressive");
		indAggBt.addActionListener(this);
		indAggBt.setVisible(false);
		
		catBt = new JButton("Pessimistic");
		catBt.addActionListener(this);
		catBt.setVisible(false);
		
		whaleBt = new JButton("Optimistic");
		whaleBt.addActionListener(this);
		whaleBt.setVisible(false);
		
		wolfBt = new JButton("Groups");
		wolfBt.addActionListener(this);
		wolfBt.setVisible(false);
		
		wolverineBt = new JButton("Alone");
		wolverineBt.addActionListener(this);
		wolverineBt.setVisible(false);
		
		drivingBt = new JButton("Driving");
		drivingBt.addActionListener(this);
		drivingBt.setVisible(false);
		
		flyingBt = new JButton("Flying");
		flyingBt.addActionListener(this);
		flyingBt.setVisible(false);
		
		turtleBt = new JButton("Stay");
		turtleBt.addActionListener(this);
		turtleBt.setVisible(false);
		
		snakeBt = new JButton("Improve");
		snakeBt.addActionListener(this);
		snakeBt.setVisible(false);
		
		owlBt = new JButton("Wisdom");
		owlBt.addActionListener(this);
		owlBt.setVisible(false);
		
		swanBt = new JButton("Beauty");
		swanBt.addActionListener(this);
		swanBt.setVisible(false);
		
		swimBt = new JButton("Swimming");
		swimBt.addActionListener(this);
		swimBt.setVisible(false);
		
		runBt = new JButton("Running");
		runBt.addActionListener(this);
		runBt.setVisible(false);
		
		dolphinBt = new JButton("Heart");
		dolphinBt.addActionListener(this);
		dolphinBt.setVisible(false);
		
		belugaBt = new JButton("Brain");
		belugaBt.addActionListener(this);
		belugaBt.setVisible(false);
		
		beeBt = new JButton("Fly");
		beeBt.addActionListener(this);
		beeBt.setVisible(false);
		
		antBt = new JButton("2 x Strength");
		antBt.addActionListener(this);
		antBt.setVisible(false);
		
		runBt = new JButton("Running");
		runBt.addActionListener(this);
		runBt.setVisible(false);
		
		
		playAgainBt = new JButton("Continue your journey?");
		playAgainBt.addActionListener(this);
		playAgainBt.setVisible(false);
		
		playAgainBt1 = new JButton("Continue your journey?");
		playAgainBt1.addActionListener(this);
		playAgainBt1.setVisible(false);
		
		horoYearEnterBt = new JButton("Enter");
		horoYearEnterBt.addActionListener(this);
		horoYearEnterBt.setVisible(false);
		
		horoZodEnterBt = new JButton("Enter");
		horoZodEnterBt.addActionListener(this);
		horoZodEnterBt.setVisible(false);
		
		horoMonthEnterBt = new JButton("Enter");
		horoMonthEnterBt.addActionListener(this);
		horoMonthEnterBt.setVisible(false);
		
		m8BRiddleEnterBt = new JButton("Enter");
		m8BRiddleEnterBt.addActionListener(this);
		m8BRiddleEnterBt.setVisible(false);
		
		userQuestionBt = new JButton("Enter");
		userQuestionBt.addActionListener(this);
		userQuestionBt.setVisible(false);
		
		label = new JLabel("What do you seek?");
		
		horoFortune = new JLabel();
		horoFortune.setBounds(300, 500, horoFortune.getWidth(), horoFortune.getHeight());
		horoFortune.setVisible(false);
		
		horoYearTF= new JTextField();
		horoYearTF.setVisible(false);
		horoYearTF.addActionListener(this);
		
		userQuestionTF= new JTextField();
		userQuestionTF.setVisible(false);
		userQuestionTF.addActionListener(this);
		
		horoZodTF= new JTextField();
		horoZodTF.setVisible(false);
		horoZodTF.addActionListener(this);
		
		horoMonthTF= new JTextField();
		horoMonthTF.setVisible(false);
		horoMonthTF.addActionListener(this);
		
		m8BTF= new JTextField();
		m8BTF.setVisible(false);
		m8BTF.addActionListener(this);
		
		panel= new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
		panel.setLayout(new GridLayout(0,1));
		panel.setSize(10000,10000);
		panel.add(label);
		panel.add(fortCookBt);
		panel.add(horoscopeBt);
		panel.add(magic8BallBt);
		panel.add(spiritAnimalBt);
		panel.add(braveBt);
		panel.add(independentBt);
		panel.add(spiritualBt);
		panel.add(socialBt);
		panel.add(hateCatsBt);
		panel.add(loveCatsBt);
		panel.add(playAgainBt);
		panel.add(m8BTF);
		panel.add(horoYearTF);
		panel.add(horoYearEnterBt);
		panel.add(m8BRiddleEnterBt);
		panel.add(horoZodEnterBt);
		panel.add(horoZodTF);
		panel.add(horoMonthEnterBt);
		panel.add(horoMonthTF);
		panel.add(horoFortune);
		panel.add(userQuestionTF);
		panel.add(userQuestionBt);
		panel.add(playAgainBt1);
		panel.add(bearBt);
		panel.add(tigerBt);
		panel.add(eagleBt);
		panel.add(lionBt);
		panel.add(passiveAggBt);
		panel.add(indAggBt);
		panel.add(whaleBt);
		panel.add(catBt);
		panel.add(wolfBt);
		panel.add(wolverineBt);
		panel.add(drivingBt);
		panel.add(flyingBt);
		panel.add(turtleBt);
		panel.add(snakeBt);
		panel.add(owlBt);
		panel.add(swanBt);
		panel.add(swimBt);
		panel.add(runBt);
		panel.add(dolphinBt);
		panel.add(belugaBt);
		panel.add(beeBt);
		panel.add(antBt);
		
		
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Fortune Teller");
		frame.pack();
		frame.setVisible(true);
		frame.setBackground(Color.CYAN);
		
		
	}
	public static void main (String[] args) {
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == horoscopeBt) {
			horoscopeBt.setVisible(false);
			fortCookBt.setVisible(false);
			magic8BallBt.setVisible(false);
			spiritAnimalBt.setVisible(false);
			horoYearTF.setVisible(true);
			horoYearEnterBt.setVisible(true);
			h = new Horoscope();
			label.setText("What is your birth year?");
			
		}
		
		else if(e.getSource() == fortCookBt) {
			horoscopeBt.setVisible(false);
			fortCookBt.setVisible(false);
			magic8BallBt.setVisible(false);
			spiritAnimalBt.setVisible(false);
			fc = new FortuneCookie();
			frame.setBounds(frame.getX(), frame.getY(), 575, frame.getHeight());
			label.setText(fc.randomFortuneCookieMessage()+" Your lucky number is " + fc.luckyNumber()+".");
			playAgainBt.setBounds(playAgainBt.getX(), playAgainBt.getY(), playAgainBt.getWidth(), 300);
			playAgainBt.setVisible(true);
			
		}
		else if(e.getSource() == magic8BallBt) {
			horoscopeBt.setVisible(false);
			fortCookBt.setVisible(false);
			magic8BallBt.setVisible(false);
			spiritAnimalBt.setVisible(false);
			frame.setBounds(frame.getX(),frame.getY(), 450, frame.getHeight());
			m8B = new Magic8Ball();
			answers = m8B.getAnswers();
			questions = m8B.getRiddles();
			index = (int)(Math.random()*answers.length);
			answer= answers[index];
			question = questions[index];
			label.setText(question);
			m8BTF.setVisible(true);
			m8BRiddleEnterBt.setVisible(true);
		}
		else if(e.getSource() == m8BRiddleEnterBt) {
			String ans= m8BTF.getText().toUpperCase();
			if(ans.equalsIgnoreCase(answer)||ans.indexOf(answer.toLowerCase())>=0||ans.indexOf(answer.toUpperCase())>=0) {
				m8BTF.setVisible(false);
				m8BRiddleEnterBt.setVisible(false);
				label.setText("You have earned thy question. Ask it.");
				userQuestionTF.setVisible(true);
				userQuestionBt.setVisible(true);
			}
			else {
				index = (int) (Math.random()*questions.length);
				answer=answers[index];
				question=questions[index];
				m8BTF.setText("");
				label.setText(question);
			}
		}
		else if(e.getSource() == userQuestionBt) {
			m8BTF.setVisible(false);
			userQuestionTF.setVisible(false);
			userQuestionBt.setVisible(false);
			label.setText(m8B.UserQuestionRun());
			playAgainBt.setVisible(true);
		}
		
		else if(e.getSource() == playAgainBt) {
			frame.setVisible(false);
			new GUI();
		}
		
		else if (e.getSource()== horoYearEnterBt) {
			userYear = horoYearTF.getText();
			horoYearTF.setVisible(false);
			horoYearEnterBt.setVisible(false);
			label.setText("What is your zodiac sign?");
			horoZodTF.setBounds(horoYearTF.getBounds());
			horoZodEnterBt.setBounds(horoYearEnterBt.getBounds());
			horoZodTF.setVisible(true);
			horoZodEnterBt.setVisible(true);
			
	
		}
		else if (e.getSource()== horoZodEnterBt) {
			userZodiac = horoZodTF.getText();
			horoZodEnterBt.setVisible(false);
			horoZodTF.setVisible(false);
			label.setText("What is your birth month #?");
			horoMonthTF.setBounds(horoYearTF.getBounds());
			horoMonthEnterBt.setBounds(horoYearEnterBt.getBounds());
			horoMonthTF.setVisible(true);
			horoMonthEnterBt.setVisible(true);
	
		}
		else if (e.getSource()== horoMonthEnterBt) {
			horoMonth = horoMonthTF.getText();
			horoMonthTF.setVisible(false);
			horoMonthEnterBt.setVisible(false);
			frame.setBounds(frame.getX(), frame.getY(), 800, frame.getHeight());
			label.setText("Based on the fact that you are a "+ userZodiac + ", born in the year of the "+h.ZodiacSign(Integer.valueOf(userYear))+", and your birthstone is "+h.birthstone(Integer.valueOf(horoMonth))+"...");
			horoFortune.setText(h.fortune());
			horoFortune.setBounds(200,100 , horoFortune.getWidth(), horoFortune.getHeight());
			horoFortune.setVisible(true);
			playAgainBt1.setVisible(true);
	
		}
		else if(e.getSource() == playAgainBt1) {
			frame.setVisible(false);
			new GUI();
		}
		else if(e.getSource() == spiritAnimalBt) {
			horoscopeBt.setVisible(false);
			fortCookBt.setVisible(false);
			magic8BallBt.setVisible(false);
			spiritAnimalBt.setVisible(false);
			span= new SpiritAnimal();
			label.setText("What trait best describes you?");
			braveBt.setVisible(true);
			independentBt.setVisible(true);
			spiritualBt.setVisible(true);
			socialBt.setVisible(true);
			
		}
		else if(e.getSource() == braveBt) {
			braveBt.setVisible(false);
			independentBt.setVisible(false);
			spiritualBt.setVisible(false);
			socialBt.setVisible(false);
			label.setText("How do you feel about cats?");
			loveCatsBt.setVisible(true);
			hateCatsBt.setVisible(true);
			
		}
		else if (e.getSource() == loveCatsBt) {
			loveCatsBt.setVisible(false);
			hateCatsBt.setVisible(false);
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Would you say that you are sociable?");
			span.braveRemoveTopHalf();
			lionBt.setVisible(true);
			tigerBt.setVisible(true);
			
		}
		
		else if (e.getSource() == hateCatsBt) {
			loveCatsBt.setVisible(false);
			hateCatsBt.setVisible(false);
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Are you a leader or a follower?");
			span.braveRemoveBottomHalf();
			eagleBt.setVisible(true);
			bearBt.setVisible(true);
		}
		else if (e.getSource() == eagleBt) {
			eagleBt.setVisible(false);
			bearBt.setVisible(false);
			span.braveRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is an Eagle" );
			playAgainBt.setVisible(true);
		}
		else if (e.getSource() == bearBt) {
			eagleBt.setVisible(false);
			bearBt.setVisible(false);
			span.braveRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Bear" );
			playAgainBt.setVisible(true);
		}
		else if (e.getSource() == lionBt) {
			lionBt.setVisible(false);
			tigerBt.setVisible(false);
			span.braveRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Lion");
			playAgainBt.setVisible(true);
		}
		else if (e.getSource() == tigerBt) {
			lionBt.setVisible(false);
			tigerBt.setVisible(false);
			span.braveRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Tiger");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == independentBt) {
			braveBt.setVisible(false);
			independentBt.setVisible(false);
			spiritualBt.setVisible(false);
			socialBt.setVisible(false);
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Are you outright-aggresive or passive aggresive?");
			passiveAggBt.setVisible(true);
			indAggBt.setVisible(true);
		}
		else if(e.getSource() == passiveAggBt) {
			passiveAggBt.setVisible(false);
			indAggBt.setVisible(false);
			span.independentRemoveTopHalf();
			label.setText("Are you an optimist or pessimist?");
			whaleBt.setVisible(true);
			catBt.setVisible(true);
		}
		else if(e.getSource() == whaleBt) {
			whaleBt.setVisible(false);
			catBt.setVisible(false);
			span.independentRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Whale");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == catBt) {
			whaleBt.setVisible(false);
			catBt.setVisible(false);
			span.independentRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Cat ");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == indAggBt) {
			passiveAggBt.setVisible(false);
			indAggBt.setVisible(false);
			span.independentRemoveBottomHalf();
			label.setText("Do you prefer to work alone or in groups?");
			wolfBt.setVisible(true);
			wolverineBt.setVisible(true);
		}
		else if(e.getSource() == wolfBt) {
			wolfBt.setVisible(false);
			wolverineBt.setVisible(false);
			span.independentRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Wolf ");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == wolverineBt) {
			wolfBt.setVisible(false);
			wolverineBt.setVisible(false);
			span.independentRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Wolverine");
			playAgainBt.setVisible(true);
		}
		
		else if(e.getSource() == spiritualBt) {
			braveBt.setVisible(false);
			independentBt.setVisible(false);
			spiritualBt.setVisible(false);
			socialBt.setVisible(false);
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Do you prefer driving or flying on vacations?");
			drivingBt.setVisible(true);
			flyingBt.setVisible(true);
		}
		else if(e.getSource() == drivingBt) {
			drivingBt.setVisible(false);
			flyingBt.setVisible(false);
			span.independentRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Do you want to stay as you are or improve?");
			turtleBt.setVisible(true);
			snakeBt.setVisible(true);
		}
		else if(e.getSource() == turtleBt) {
			turtleBt.setVisible(false);
			snakeBt.setVisible(false);
			span.independentRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Turtle");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == snakeBt) {
			turtleBt.setVisible(false);
			snakeBt.setVisible(false);
			span.independentRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Snake");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == flyingBt) {
			drivingBt.setVisible(false);
			flyingBt.setVisible(false);
			span.independentRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Do you wish for wisdom or beauty?");
			owlBt.setVisible(true);
			swanBt.setVisible(true);
		}
		else if(e.getSource() == owlBt) {
			owlBt.setVisible(false);
			swanBt.setVisible(false);
			span.independentRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is an Owl" );
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == swanBt) {
			owlBt.setVisible(false);
			swanBt.setVisible(false);
			span.independentRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Swan");
			playAgainBt.setVisible(true);
		}
		
		else if(e.getSource() == socialBt) {
			braveBt.setVisible(false);
			independentBt.setVisible(false);
			spiritualBt.setVisible(false);
			socialBt.setVisible(false);
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Do you prefer swimming or running?");
			swimBt.setVisible(true);
			runBt.setVisible(true);
		}
		else if(e.getSource() == swimBt) {
			swimBt.setVisible(false);
			runBt.setVisible(false);
			span.socialRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Do you think with your brain or your heart?");
			belugaBt.setVisible(true);
			dolphinBt.setVisible(true);
		}
		else if(e.getSource() == belugaBt) {
			belugaBt.setVisible(false);
			dolphinBt.setVisible(false);
			span.socialRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Beluga");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == dolphinBt) {
			belugaBt.setVisible(false);
			dolphinBt.setVisible(false);
			span.socialRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Dolphin");
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == runBt) {
			swimBt.setVisible(false);
			runBt.setVisible(false);
			span.socialRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Would you rather fly or be twice as strong?");
			beeBt.setVisible(true);
			antBt.setVisible(true);
		}
		else if(e.getSource() == beeBt) {
			beeBt.setVisible(false);
			antBt.setVisible(false);
			span.socialRemoveBottomHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is a Bee" );
			playAgainBt.setVisible(true);
		}
		else if(e.getSource() == antBt) {
			beeBt.setVisible(false);
			antBt.setVisible(false);
			span.socialRemoveTopHalf();
			frame.setBounds(frame.getX(), frame.getY(), 400, frame.getHeight());
			label.setText("Your spirit animal is an Ant" );
			playAgainBt.setVisible(true);
		}
		
	}
}