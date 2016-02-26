package sharkzilla;

// Import necessary libraries:
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.border.LineBorder;

public class InterfaceView {

	// Attributes:
	private JFrame frame;

	private JButton btnBestDays;
	private JButton btnDailyDashboard;
	private JButton btnDailyGoals;
	private JButton btnLifeTimeGoals;
	private JButton btnAccolades;
	private JButton btnTimeSeries;

	private JPanel panelDashboardView;
	private JPanel panelBestDaysView;
	private JPanel panelAccoladesView;
	private JPanel panelLifetimeTotalsView;
	private JPanel panelTimeSeriesView;
	private JPanel panelDailyGoalsView;

	// Launch Application:
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceView window = new InterfaceView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Constructor:
	public InterfaceView() {
		initialize();
	}

	// Launch the program:
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		JPanel CardLayout = new JPanel();
		CardLayout.setBounds(0, 0, 472, 378);
		frame.getContentPane().add(CardLayout);
		CardLayout.setLayout(new CardLayout(0, 0));

		panelDashboardView = new JPanel();
		CardLayout.add(panelDashboardView, "name_1456446913223833000");
		panelDashboardView.setLayout(null);

		panelBestDaysView = new JPanel();
		CardLayout.add(panelBestDaysView, "name_1456446950405885000");
		panelBestDaysView.setLayout(null);

		panelAccoladesView = new JPanel();
		CardLayout.add(panelAccoladesView, "name_1456451728799720000");
		panelAccoladesView.setLayout(null);

		panelLifetimeTotalsView = new JPanel();
		CardLayout.add(panelLifetimeTotalsView, "name_1456451737104428000");
		panelLifetimeTotalsView.setLayout(null);

		panelTimeSeriesView = new JPanel();
		CardLayout.add(panelTimeSeriesView, "name_1456451744019523000");
		panelTimeSeriesView.setLayout(null);

		panelDailyGoalsView = new JPanel();
		CardLayout.add(panelDailyGoalsView, "name_1456456744677539000");
		panelDailyGoalsView.setLayout(null);

		menuBar();

		dashboardView();

		bestdaysView();

		actionEvents();

		accoladesView();

		lifetimetotalsView();

		timeseriesView();

		dailygoalsView();
	}

	private void menuBar() {

		JToolBar MenuBar = new JToolBar();
		MenuBar.setBounds(469, 0, 131, 378);
		MenuBar.setFloatable(false);
		MenuBar.setBackground(Color.DARK_GRAY);
		MenuBar.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(MenuBar);

		btnDailyDashboard = new JButton("Daily Dashboard");
		btnDailyDashboard.setBorder(new LineBorder(null, 3, true));
		btnDailyDashboard.setOpaque(true);
		btnDailyDashboard.setBackground(Color.WHITE);
		btnDailyDashboard.setForeground(Color.BLACK);
		btnDailyDashboard.setAlignmentX(0.5f);
		btnDailyDashboard.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDailyDashboard.setMargin(new Insets(0, 0, 0, 0));
		btnDailyDashboard.setMaximumSize(new Dimension(150, 50));
		MenuBar.add(btnDailyDashboard);

		btnBestDays = new JButton("Best Days");
		btnBestDays.setBorder(new LineBorder(null, 3, true));
		btnBestDays.setOpaque(true);
		btnBestDays.setBackground(Color.WHITE);
		btnBestDays.setForeground(Color.BLACK);
		btnBestDays.setAlignmentX(0.5f);
		btnBestDays.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBestDays.setMargin(new Insets(0, 0, 0, 0));
		btnBestDays.setMaximumSize(new Dimension(150, 50));
		MenuBar.add(btnBestDays);

		btnDailyGoals = new JButton("Daily Goals");
		btnDailyGoals.setBorder(new LineBorder(null, 3, true));
		btnDailyGoals.setOpaque(true);
		btnDailyGoals.setBackground(Color.WHITE);
		btnDailyGoals.setForeground(Color.BLACK);
		btnDailyGoals.setAlignmentX(0.5f);
		btnDailyGoals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDailyGoals.setMargin(new Insets(0, 0, 0, 0));
		btnDailyGoals.setMaximumSize(new Dimension(150, 50));
		MenuBar.add(btnDailyGoals);

		btnLifeTimeGoals = new JButton("Lifetime Totals");
		btnLifeTimeGoals.setBorder(new LineBorder(null, 3, true));
		btnLifeTimeGoals.setOpaque(true);
		btnLifeTimeGoals.setBackground(Color.WHITE);
		btnLifeTimeGoals.setForeground(Color.BLACK);
		btnLifeTimeGoals.setAlignmentX(0.5f);
		btnLifeTimeGoals.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLifeTimeGoals.setMargin(new Insets(0, 0, 0, 0));
		btnLifeTimeGoals.setMaximumSize(new Dimension(150, 50));
		MenuBar.add(btnLifeTimeGoals);

		btnAccolades = new JButton("Accolades");
		btnAccolades.setBorder(new LineBorder(null, 3, true));
		btnAccolades.setOpaque(true);
		btnAccolades.setBackground(Color.WHITE);
		btnAccolades.setForeground(Color.BLACK);
		btnAccolades.setAlignmentX(0.5f);
		btnAccolades.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAccolades.setMargin(new Insets(0, 0, 0, 0));
		btnAccolades.setMaximumSize(new Dimension(150, 50));
		MenuBar.add(btnAccolades);

		btnTimeSeries = new JButton("Time Series");
		btnTimeSeries.setBorder(new LineBorder(null, 3, true));
		btnTimeSeries.setOpaque(true);
		btnTimeSeries.setBackground(Color.WHITE);
		btnTimeSeries.setForeground(Color.BLACK);
		btnTimeSeries.setAlignmentX(0.5f);
		btnTimeSeries.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTimeSeries.setMargin(new Insets(0, 0, 0, 0));
		btnTimeSeries.setMaximumSize(new Dimension(150, 50));
		MenuBar.add(btnTimeSeries);
	}

	private void dashboardView() {
		JLabel lblDailyDashboard = new JLabel("Daily Dashboard");
		lblDailyDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDailyDashboard.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblDailyDashboard.setBounds(0, 0, 472, 30);
		panelDashboardView.add(lblDailyDashboard);

		JLabel lblCalories = new JLabel("Calories");
		lblCalories.setBounds(132, 65, 73, 25);
		panelDashboardView.add(lblCalories);

		JLabel lblSteps = new JLabel("Steps");
		lblSteps.setBounds(132, 102, 73, 25);
		panelDashboardView.add(lblSteps);

		JLabel lblDistance = new JLabel("Distance");
		lblDistance.setBounds(132, 139, 73, 25);
		panelDashboardView.add(lblDistance);

		JLabel lblActiveMinutes = new JLabel("Active Minutes");
		lblActiveMinutes.setBounds(241, 63, 106, 25);
		panelDashboardView.add(lblActiveMinutes);

		JLabel lblSe = new JLabel("Sedentary Minutes");
		lblSe.setBounds(241, 102, 125, 25);
		panelDashboardView.add(lblSe);

		JLabel lblFloors = new JLabel("Floors");
		lblFloors.setBounds(132, 176, 73, 25);
		panelDashboardView.add(lblFloors);

		JLabel lblSedentaryMinutes = new JLabel("Sedentary\nMinutes");
		lblSedentaryMinutes.setBounds(241, 136, 125, 30);
		panelDashboardView.add(lblSedentaryMinutes);

		JLabel lblDailyProgress = new JLabel("Daily Progress");
		lblDailyProgress.setBounds(241, 171, 125, 30);
		panelDashboardView.add(lblDailyProgress);

		JLabel lblNewLabel_1 = new JLabel("Last Updated: Date");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(341, 356, 125, 16);
		panelDashboardView.add(lblNewLabel_1);

		JButton btnNewButton_2 = new JButton("Heart Zone");
		btnNewButton_2.setBounds(0, 351, 117, 29);
		panelDashboardView.add(btnNewButton_2);
	}

	private void bestdaysView() {
		JLabel lblBestDays = new JLabel("Best Days");
		lblBestDays.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestDays.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblBestDays.setBounds(0, 0, 472, 30);
		panelBestDaysView.add(lblBestDays);

		JLabel lblDistance = new JLabel("Distance: <distance>");
		lblDistance.setBounds(72, 70, 189, 16);
		panelBestDaysView.add(lblDistance);

		JLabel lblFloors = new JLabel("Floors: <floors>");
		lblFloors.setBounds(72, 98, 189, 16);
		panelBestDaysView.add(lblFloors);

		JLabel lblSteps = new JLabel("Steps: <steps>");
		lblSteps.setBounds(72, 126, 189, 16);
		panelBestDaysView.add(lblSteps);
	}

	private void accoladesView() {
		JLabel lblAccolades = new JLabel("Accolades");
		lblAccolades.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccolades.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblAccolades.setBounds(0, 0, 472, 32);
		panelAccoladesView.add(lblAccolades);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(457, 6, 15, 372);
		panelAccoladesView.add(scrollBar);

		JCheckBox chckbxTask = new JCheckBox("Task #1: <description>");
		chckbxTask.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		chckbxTask.setBounds(10, 60, 294, 23);
		panelAccoladesView.add(chckbxTask);

		JCheckBox chckbxTask_1 = new JCheckBox("Task #2: <description>");
		chckbxTask_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		chckbxTask_1.setBounds(10, 95, 294, 23);
		panelAccoladesView.add(chckbxTask_1);

		JCheckBox chckbxTask_2 = new JCheckBox("Task #3: <description>");
		chckbxTask_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		chckbxTask_2.setBounds(10, 130, 294, 23);
		panelAccoladesView.add(chckbxTask_2);

		JCheckBox chckbxTask_3 = new JCheckBox("Task #4: <description>");
		chckbxTask_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		chckbxTask_3.setBounds(10, 165, 294, 23);
		panelAccoladesView.add(chckbxTask_3);

		JCheckBox chckbxTask_4 = new JCheckBox("Task #5: <description>");
		chckbxTask_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		chckbxTask_4.setBounds(10, 200, 294, 23);
		panelAccoladesView.add(chckbxTask_4);
	}

	private void lifetimetotalsView() {
		JLabel lblNewLabel = new JLabel("Lifetime Totals");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel.setBounds(0, 0, 472, 32);
		panelLifetimeTotalsView.add(lblNewLabel);

		JLabel lblDistance = new JLabel("Distance: <distance>");
		lblDistance.setBounds(72, 70, 189, 16);
		panelLifetimeTotalsView.add(lblDistance);

		JLabel lblFloors = new JLabel("Floors: <floors>");
		lblFloors.setBounds(72, 98, 189, 16);
		panelLifetimeTotalsView.add(lblFloors);

		JLabel lblSteps = new JLabel("Steps: <steps>");
		lblSteps.setBounds(72, 126, 189, 16);
		panelLifetimeTotalsView.add(lblSteps);
	}

	private void timeseriesView() {
		JLabel lblNewLabel = new JLabel("Time Series");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel.setBounds(0, 0, 472, 32);
		panelTimeSeriesView.add(lblNewLabel);

		JToolBar graphTitle = new JToolBar();
		graphTitle.setFloatable(false);
		graphTitle.setBounds(128, 44, 235, 20);
		panelTimeSeriesView.add(graphTitle);

		JButton btnSteps = new JButton("Steps");
		graphTitle.add(btnSteps);

		JButton btnCalories = new JButton("Calories");
		graphTitle.add(btnCalories);

		JButton btnDistance = new JButton("Distance");
		graphTitle.add(btnDistance);

		JButton btnHeartDisance = new JButton("Heart Rate");
		graphTitle.add(btnHeartDisance);

		JToolBar zoom = new JToolBar();
		zoom.setFloatable(false);
		zoom.setBounds(173, 352, 130, 20);
		panelTimeSeriesView.add(zoom);

		JButton btnZoomIn = new JButton("Zoom In");
		zoom.add(btnZoomIn);

		JButton btnZoomOut = new JButton("Zoom Out");
		zoom.add(btnZoomOut);

		JLabel lblGraph = new JLabel("Graph");
		lblGraph.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblGraph.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraph.setBackground(new Color(64, 64, 64));
		lblGraph.setBounds(0, 148, 472, 41);
		panelTimeSeriesView.add(lblGraph);		
	}

	private void dailygoalsView() {
		JLabel lblDailyGoals = new JLabel("Daily Goals");
		lblDailyGoals.setForeground(Color.BLACK);
		lblDailyGoals.setBackground(Color.GRAY);
		lblDailyGoals.setHorizontalAlignment(SwingConstants.CENTER);
		lblDailyGoals.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblDailyGoals.setBounds(0, 0, 472, 28);
		panelDailyGoalsView.add(lblDailyGoals);

		JLabel lblSteps = new JLabel("Steps:");
		lblSteps.setBounds(16, 52, 61, 16);
		panelDailyGoalsView.add(lblSteps);

		JLabel lblDistance = new JLabel("Distance:");
		lblDistance.setBounds(16, 80, 61, 16);
		panelDailyGoalsView.add(lblDistance);

		JLabel lblCalories = new JLabel("Calories:");
		lblCalories.setBounds(16, 108, 61, 16);
		panelDailyGoalsView.add(lblCalories);

		JLabel lblFloors = new JLabel("Floors:");
		lblFloors.setBounds(16, 136, 61, 16);
		panelDailyGoalsView.add(lblFloors);

		JButton btnAddNewGoal = new JButton("Add \nNew Goal");
		btnAddNewGoal.setBounds(145, 163, 144, 22);
		panelDailyGoalsView.add(btnAddNewGoal);

		JLabel lblMyGoals = new JLabel("My Goals:");
		lblMyGoals.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblMyGoals.setBounds(16, 206, 85, 28);
		panelDailyGoalsView.add(lblMyGoals);

	}

	private void actionEvents() {
		// Switch window to Best Days screen:
		btnBestDays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboardView.setVisible(false);
				panelBestDaysView.setVisible(true);
				panelLifetimeTotalsView.setVisible(false);
				panelDailyGoalsView.setVisible(false);
				panelAccoladesView.setVisible(false);
				panelTimeSeriesView.setVisible(false);
			}
		});

		// Switch window to Daily Dashboard screen:
		btnDailyDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboardView.setVisible(true);
				panelBestDaysView.setVisible(false);
				panelLifetimeTotalsView.setVisible(false);
				panelDailyGoalsView.setVisible(false);
				panelAccoladesView.setVisible(false);
				panelTimeSeriesView.setVisible(false);
			}
		});

		// Switch window to Lifetime Totals screen:
		btnLifeTimeGoals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboardView.setVisible(false);
				panelBestDaysView.setVisible(false);
				panelLifetimeTotalsView.setVisible(true);
				panelDailyGoalsView.setVisible(false);
				panelAccoladesView.setVisible(false);
				panelTimeSeriesView.setVisible(false);
			}
		});

		btnDailyGoals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboardView.setVisible(false);
				panelBestDaysView.setVisible(false);
				panelLifetimeTotalsView.setVisible(false);
				panelDailyGoalsView.setVisible(true);
				panelAccoladesView.setVisible(false);
				panelTimeSeriesView.setVisible(false);
			}
		});

		// Switch window to Accolades screen:
		btnAccolades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboardView.setVisible(false);
				panelBestDaysView.setVisible(false);
				panelLifetimeTotalsView.setVisible(false);
				panelDailyGoalsView.setVisible(false);
				panelAccoladesView.setVisible(true);
				panelTimeSeriesView.setVisible(false);
			}
		});

		// Switch window to Timeseries screen:
		btnTimeSeries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDashboardView.setVisible(false);
				panelBestDaysView.setVisible(false);
				panelLifetimeTotalsView.setVisible(false);
				panelDailyGoalsView.setVisible(false);
				panelAccoladesView.setVisible(false);
				panelTimeSeriesView.setVisible(true);
			}
		});

	}
}
