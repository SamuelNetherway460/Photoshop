/* Samuel Netherway 955794 */
/* This is my own work */

package main.controllers;

// javafx imports
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

// java imports
import javafx.scene.input.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class PhotoshopController {

    @FXML
    private SplitPane mainScene;

    @FXML
    private SplitPane imageViewerScene;

    @FXML
    private TitledPane originalImageScene;

    @FXML
    private ImageView originalImage;

    @FXML
    private TitledPane alteredImageScene;

    @FXML
    private ImageView alteredImage;

    @FXML
    private Tab generalOperationsTab;

    @FXML
    private Button loadImageButton;

    @FXML
    private ImageView loadImageIcon;

    @FXML
    private TextField imageFileNameTextField;

    @FXML
    private Button revertButton;

    @FXML
    private ImageView revertImageIcon;

    @FXML
    private MenuButton loadPresetImagesMenuButton;

    @FXML
    private MenuItem loadCarsMenuButton;

    @FXML
    private MenuItem loadRaytraceMenuButton;

    @FXML
    private MenuItem loadBreakfastMenuButton;

    @FXML
    private MenuItem loadGreysacleNoiseMenuButton;

    @FXML
    private MenuItem loadColoredNoiseMenuButton;

    @FXML
    private ImageView loadPresetImageIcon;

    @FXML
    private Tab pixelInversionTab;

    @FXML
    private GridPane invertGrid;

    @FXML
    private ToggleButton invertToggleButton1;

    @FXML
    private ImageView pixelInvertIcon;

    @FXML
    private Tab gammaCorrectionTab;

    @FXML
    private GridPane gammaGrid;

    @FXML
    private Slider adjustGammaSlider;

    @FXML
    private TextField gammaSliderValue;

    @FXML
    private ImageView scaleA;

    @FXML
    private ImageView scaleB;

    @FXML
    private ImageView scaleC;

    @FXML
    private ImageView scaleD;

    @FXML
    private ImageView scaleE;

    @FXML
    private ImageView scaleF;

    @FXML
    private ImageView scaleG;

    @FXML
    private ImageView scaleH;

    @FXML
    private ImageView scaleI;

    @FXML
    private ImageView scaleJ;

    @FXML
    private ImageView scaleK;

    @FXML
    private ImageView scaleL;

    @FXML
    private ImageView scaleM;

    @FXML
    private ImageView scaleN;

    @FXML
    private ImageView scaleO;

    @FXML
    private ImageView scaleP;

    @FXML
    private ImageView scaleQ;

    @FXML
    private ImageView scaleR;

    @FXML
    private ImageView scaleS;

    @FXML
    private ImageView scaleT;

    @FXML
    private ImageView scaleU;

    @FXML
    private ImageView scaleV;

    @FXML
    private ImageView scaleW;

    @FXML
    private ImageView scaleX;

    @FXML
    private ImageView sun;

    @FXML
    private ImageView moon;

    @FXML
    private Tab contrastStretchingTab1;

    @FXML
    private GridPane contrastStretchingGrid;

    @FXML
    private Label R1Label;

    @FXML
    private Label S1Label;

    @FXML
    private Label s2Label;

    @FXML
    private Label r2Label;

    @FXML
    private Slider r1Slider;

    @FXML
    private Slider s1Slider;

    @FXML
    private Slider s2Slider;

    @FXML
    private Slider r2Slider;

    @FXML
    private TextField r1TextField;

    @FXML
    private TextField s1TextField;

    @FXML
    private TextField s2TextField;

    @FXML
    private TextField r2TextField;

    @FXML
    private Button applyContrastStretchingButton;

    @FXML
    private ToggleButton liveContrastStretchingToggleButton;

    @FXML
    private ToggleButton controlR1S1ToggleButton;

    @FXML
    private ToggleButton controlR2S2ToggleButton;

    @FXML
    private NumberAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private LineChart<?, ?> contrastStretchingGraph;

    @FXML
    private NumberAxis oldValues;

    @FXML
    private NumberAxis newValues;

    @FXML
    private Tab histogramGraphsTab;

    @FXML
    private Tab redChannelTab1;

    @FXML
    private BarChart<?, ?> redChannelOriginalBarChart;

    @FXML
    private BarChart<?, ?> redChannelAlteredBarChart;

    @FXML
    private Tab greenTab1;

    @FXML
    private BarChart<?, ?> greenChannelOriginalBarChart;

    @FXML
    private BarChart<?, ?> greenChannelAlteredBarChart;

    @FXML
    private Tab blueChannelTab1;

    @FXML
    private BarChart<?, ?> blueChannelOriginalBarChart;

    @FXML
    private BarChart<?, ?> blueChannelAlteredBarChart;

    @FXML
    private Tab greyscaleTab1;

    @FXML
    private BarChart<?, ?> greyChannelOriginalBarChart;

    @FXML
    private BarChart<?, ?> greyChannelAlteredBarChart;

    @FXML
    private Tab redChannelTab;

    @FXML
    private LineChart<?, ?> redChannelGraph;

    @FXML
    private Tab greenTab;

    @FXML
    private LineChart<?, ?> greenChannelGraph;

    @FXML
    private Tab blueChannelTab;

    @FXML
    private LineChart<?, ?> blueChannelGraph;

    @FXML
    private Tab greyscaleTab;

    @FXML
    private LineChart<?, ?> greyscaleGraph;

    @FXML
    private Tab HistogramEqualisationTab;

    @FXML
    private GridPane histogramEqualisationGrid;

    @FXML
    private TextField i1TextField;

    @FXML
    private TextField i2TextField;

    @FXML
    private Button applyGreyscaleHistogramEqualisationButton;

    @FXML
    private Button performHistogramEqualisationButton;

    @FXML
    private Button fixNoisyImage1;

    @FXML
    private Button lowPassFilterButton1;

    @FXML
    private Button highPassFilterButton1;

    @FXML
    private Button sobelEdgeDetectorX1;

    @FXML
    private Button sobelEdgeDetectorY1;

    @FXML
    private Button laplacianMatrixApplicationButton1;

    @FXML
    private Button blurButton;

    @FXML
    private Button moreBlurButton;

    @FXML
    private Button gaussianBlurButton;

    @FXML
    private Button applyCustomCrossCorrelationValues1;

    @FXML
    private Button clearCustomValuesButton1;

    @FXML
    private TextField a;

    @FXML
    private TextField b;

    @FXML
    private TextField d;

    @FXML
    private TextField e;

    @FXML
    private TextField c;

    @FXML
    private TextField f;

    @FXML
    private TextField i;

    @FXML
    private TextField h;

    @FXML
    private TextField g;

    @FXML
    private Slider edgeGradientSlider;

    @FXML
    private ToggleButton liveEdgeDetectionUpdatesToggle;

    @FXML
    private LineChart<Number, Number> contrastStretchingCoordinatesGraph;

    private static final double INITIAL_GAMMA_ADJUSTMENT_VALUE = 0.0;
    private static final double INITIAL_R1_CONTRAST_STRETCHING_VALUE = 50.0;
    private static final double INITIAL_S1_CONTRAST_STRETCHING_VALUE = 20.0;
    private static final double INITIAL_R2_CONTRAST_STRETCHING_VALUE = 225.0;
    private static final double INITIAL_S2_CONTRAST_STRETCHING_VALUE = 200.0;
    private static final int INITIAL_I1_HISTOGRAM_EQUALISATION_VALUE = 0;
    private static final int INITIAL_I2_HISTOGRAM_EQUALISATION_VALUE = 255;
    private static final int ORIGIN_X = 0;
    private static final int ORIGIN_Y = 0;
    private static final int MAX_X = 255;
    private static final int MAX_Y = 255;
    private static String control = "none";
    private static int r1 = 20;
    private static int s1 = 50;
    private static int r2 = 200;
    private static int s2 = 225;
    private static Image tempImage;
    private static boolean contrastStretchingIsLive = false;
    private static boolean edgeDetectionIsLive = false;

    // Image Details and Operations
    private static int width;
    private static int height;

    // Create a new image of that width and height
    private static WritableImage effectAppliedImage;
    // Get an interface to write to that image memory
    private static PixelWriter imageWriter;
    // Get an interface to read from the original image passed as the parameter to the function
    private static PixelReader imageReader;

    /**
     * Initialises the system with default values, slider positions, images, etc.
     *
     * @throws FileNotFoundException If the image file is not found.
     */
    public void initialize() throws FileNotFoundException {

        // Default image
        javafx.scene.image.Image image = new Image(new FileInputStream("Raytrace.jpg"));

        // Display the original and altered image to the user
        this.originalImage.setImage(image);
        this.alteredImage.setImage(image);

        // Obtaining the image width and height
        width = (int)image.getWidth();
        height = (int)image.getHeight();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = image.getPixelReader();

        makeHistogramGraphs();
        makeContrastStretchingGraphs();

        // Gamma Correction Sliders
        gammaSliderValue.setText(new Double(INITIAL_GAMMA_ADJUSTMENT_VALUE).toString());
        gammaSliderValue.textProperty().bindBidirectional(adjustGammaSlider.valueProperty(), NumberFormat.getNumberInstance());

        // Contrast Stretching Sliders
        r1TextField.setText(new Double(INITIAL_R1_CONTRAST_STRETCHING_VALUE).toString());
        r1TextField.textProperty().bindBidirectional(r1Slider.valueProperty(), NumberFormat.getNumberInstance());

        s1TextField.setText(new Double(INITIAL_S1_CONTRAST_STRETCHING_VALUE).toString());
        s1TextField.textProperty().bindBidirectional(s1Slider.valueProperty(), NumberFormat.getNumberInstance());

        r2TextField.setText(new Double(INITIAL_R2_CONTRAST_STRETCHING_VALUE).toString());
        r2TextField.textProperty().bindBidirectional(r2Slider.valueProperty(), NumberFormat.getNumberInstance());

        s2TextField.setText(new Double(INITIAL_S2_CONTRAST_STRETCHING_VALUE).toString());
        s2TextField.textProperty().bindBidirectional(s2Slider.valueProperty(), NumberFormat.getNumberInstance());

        // Histogram Equalisation
        i1TextField.setText(new Integer(INITIAL_I1_HISTOGRAM_EQUALISATION_VALUE).toString());
        i2TextField.setText(new Integer(INITIAL_I2_HISTOGRAM_EQUALISATION_VALUE).toString());

        // Removes the animated property of the graph
        contrastStretchingCoordinatesGraph.setAnimated(false);

        // Preventing the user from entering values outside of the range 0 - 255
        resetContrastStretchingValues();

        // Creating the graphs with the default coordinates
        updateContrastStretchingCoordinatesGraph();

        // Setting up all of the relevant icons for the entire GUI
        setAllIcons();

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Adding a listener to the gamma Adjustment Slider for live image feedback
        adjustGammaSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                try {
                    updateImageGamma();
                } catch (FileNotFoundException e) {
                    System.out.println("Cannot find gamma brightness indicator image");
                }
            }
        });

        // Adding a listener to the edge gradient slider for live image feedback
        edgeGradientSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                updateEdgeGradient();
            }
        });

        // Adding a listener to the r1 value Slider for live graph a image feedback
        r1Slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double r1Temp = Double.parseDouble(r1TextField.getText());
                r1 = (int) r1Temp;
                // Upon the slider moving, only update the image if live Contrast Stretching is on
                if (contrastStretchingIsLive) {
                    updateContrastStretching();
                }
                updateContrastStretchingCoordinatesGraph();
            }
        });

        // Adding a listener to the s1 value Slider for live graph a image feedback
        s1Slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double s1Temp = Double.parseDouble(s1TextField.getText());
                s1 = (int) s1Temp;
                // Upon the slider moving, only update the image if live Contrast Stretching is on
                if (contrastStretchingIsLive) {
                    updateContrastStretching();
                }
                updateContrastStretchingCoordinatesGraph();
            }
        });

        // Adding a listener to the r2 value Slider for live graph a image feedback
        r2Slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double r2Temp = Double.parseDouble(r2TextField.getText());
                r2 = (int) r2Temp;
                // Upon the slider moving, only update the image if live Contrast Stretching is on
                if (contrastStretchingIsLive) {
                    updateContrastStretching();
                }
                updateContrastStretchingCoordinatesGraph();
            }
        });

        // Adding a listener to the s2 value Slider for live graph a image feedback
        s2Slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                double s2Temp = Double.parseDouble(s2TextField.getText());
                s2 = (int) s2Temp;
                // Upon the slider moving, only update the image if live Contrast Stretching is on
                if (contrastStretchingIsLive) {
                    updateContrastStretching();
                }
                updateContrastStretchingCoordinatesGraph();
            }
        });

        // Ensuring that only one of the two control toggle buttons can be selected at a time
        ToggleGroup contrastStretchingCoordinatesTogglegroup = new ToggleGroup();
        controlR1S1ToggleButton.setToggleGroup(contrastStretchingCoordinatesTogglegroup);
        controlR2S2ToggleButton.setToggleGroup(contrastStretchingCoordinatesTogglegroup);

        // Setting the initial Colors for the gamma brightness indicator
        updateImageGamma();
        System.out.println("Initialize Completed");
    }

    /**
     * Initialises the system by adding all of the icons to the relevant buttons
     *
     * @throws FileNotFoundException If any of the icon image files cannot be found.
     */
    public void setAllIcons () throws FileNotFoundException {

        // Retrieving all of the relevant icons
        javafx.scene.image.Image loadIcon = new Image(new FileInputStream("icons/load.png"));
        javafx.scene.image.Image invertIcon = new Image(new FileInputStream("icons/invert.png"));
        javafx.scene.image.Image reloadIcon = new Image(new FileInputStream("icons/reload.png"));
        javafx.scene.image.Image searchIcon = new Image(new FileInputStream("icons/search.png"));
        javafx.scene.image.Image moonIcon = new Image(new FileInputStream("icons/moon.png"));
        javafx.scene.image.Image sunIcon = new Image(new FileInputStream("icons/sun.png"));

        // Setting all of the relevant icons
        loadImageIcon.setImage(loadIcon);
        revertImageIcon.setImage(reloadIcon);
        loadPresetImageIcon.setImage(searchIcon);
        pixelInvertIcon.setImage(invertIcon);
        moon.setImage(moonIcon);
        sun.setImage(sunIcon);
    }

    /**
     * Resets the Contrast Stretching values (r1, s1, r2, s2) to their original values (20, 50, 200, 225) respectively
     */
    public void resetContrastStretchingValues () {

        // Prevent the graph axis from auto adjusting
        x.setAutoRanging(false);
        y.setAutoRanging(false);

        // Setting the upper and lower bounds of the x and y axis
        x.setLowerBound(ORIGIN_X);
        x.setUpperBound(MAX_X);
        y.setLowerBound(ORIGIN_Y);
        y.setUpperBound(MAX_Y);

        // Preparing the default values to be added to the relevant text fields
        String r1String = r1 + "";
        String s1String = s1 + "";
        String r2String = r2 + "";
        String s2String = s2 + "";

        // Adding the default values to the relevant text fields
        r1TextField.setText(r1String);
        s1TextField.setText(s1String);
        r2TextField.setText(r2String);
        s2TextField.setText(s2String);

        System.out.println("Contrast Stretching Values Reset");
    }

    /**
     * Loads an image based on the image filename that the user enters.
     *
     * @throws FileNotFoundException If the image file is not found.
     */
    public void loadImage () throws FileNotFoundException {

        String imageFileName = "Cars.jpg"; // Default image

        // Image cannot be found
        if (imageFileNameTextField.getText().equals("")) {
            System.out.println("No Input");
        // Image is found and loaded
        } else {
            imageFileName = imageFileNameTextField.getText();
            System.out.println("Loaded new Image");
            javafx.scene.image.Image newImage = new Image(new FileInputStream(imageFileName));

            // Update the GUI so the new loaded image is displayed
            originalImage.setImage(newImage);
            alteredImage.setImage(newImage);

            // Initialising the temporary image
            tempImage = originalImage.getImage();

            // Obtaining the image width and height
            width = (int)newImage.getWidth();
            height = (int)newImage.getHeight();

            // Create a new image of that width and height
            effectAppliedImage = new WritableImage(width, height);
            // Get an interface to write to that image memory
            imageWriter = effectAppliedImage.getPixelWriter();
            // Get an interface to read from the original image passed as the parameter to the function
            imageReader = newImage.getPixelReader();

            makeHistogramGraphs();
        }
    }

    /**
     * Loads the Cars.jpg image.
     *
     * @throws FileNotFoundException If the image file cannot be found.
     */
    public void loadCarsImage () throws FileNotFoundException {

        javafx.scene.image.Image image = new Image(new FileInputStream("Cars.jpg"));

        this.originalImage.setImage(image);
        this.alteredImage.setImage(image);

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Obtaining the image width and height
        width = (int)image.getWidth();
        height = (int)image.getHeight();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = image.getPixelReader();

        makeHistogramGraphs();
        makeContrastStretchingGraphs();

        System.out.println("Cars.jpg Image Loaded");
    }

    /**
     * Loads the Raytrace.jpg image.
     *
     * @throws FileNotFoundException If the image file cannot be found.
     */
    public void loadRaytraceImage () throws FileNotFoundException {

        javafx.scene.image.Image image = new Image(new FileInputStream("Raytrace.jpg"));

        this.originalImage.setImage(image);
        this.alteredImage.setImage(image);

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Obtaining the image width and height
        width = (int)image.getWidth();
        height = (int)image.getHeight();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = image.getPixelReader();

        makeHistogramGraphs();
        makeContrastStretchingGraphs();

        System.out.println("Raytrace.jpg Image Loaded");
    }

    /**
     * Loads the Breakfast.jpg image.
     *
     * @throws FileNotFoundException If the image file cannot be found.
     */
    public void loadBreakfastImage () throws FileNotFoundException {

        javafx.scene.image.Image image = new Image(new FileInputStream("Breakfast.jpg"));

        this.originalImage.setImage(image);
        this.alteredImage.setImage(image);

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Obtaining the image width and height
        width = (int)image.getWidth();
        height = (int)image.getHeight();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = image.getPixelReader();

        makeHistogramGraphs();
        makeContrastStretchingGraphs();

        System.out.println("Breakfast.jpg Image Loaded");
    }

    /**
     * Loads the GreyscaleNoise.png image.
     *
     * @throws FileNotFoundException If the image file cannot be found.
     */
    public void loadGreysacleNoiseImage () throws FileNotFoundException {

        javafx.scene.image.Image image = new Image(new FileInputStream("GreyscaleNoise.png"));

        this.originalImage.setImage(image);
        this.alteredImage.setImage(image);

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Obtaining the image width and height
        width = (int)image.getWidth();
        height = (int)image.getHeight();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = image.getPixelReader();

        makeHistogramGraphs();
        makeContrastStretchingGraphs();

        System.out.println("GreyscaleNoise.png Image Loaded");
    }

    /**
     * Loads the ColoredNoise.jpg image.
     *
     * @throws FileNotFoundException If the image file cannot be found.
     */
    public void loadColoredNoiseImage () throws FileNotFoundException {

        javafx.scene.image.Image image = new Image(new FileInputStream("ColoredNoise.jpg"));

        this.originalImage.setImage(image);
        this.alteredImage.setImage(image);

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Obtaining the image width and height
        width = (int)image.getWidth();
        height = (int)image.getHeight();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = image.getPixelReader();

        makeHistogramGraphs();
        makeContrastStretchingGraphs();

        System.out.println("ColoredNoise.jpg Image Loaded");
    }

    /**
     * Reverts the altered image to the original image that the user last loaded.
     */
    public void revertBackToOriginalImage () {

        alteredImage.setImage(originalImage.getImage());

        // Initialising the temporary image
        tempImage = originalImage.getImage();

        // Create a new image of that width and height
        effectAppliedImage = new WritableImage(width, height);
        // Get an interface to write to that image memory
        imageWriter = effectAppliedImage.getPixelWriter();
        // Get an interface to read from the original image passed as the parameter to the function
        imageReader = originalImage.getImage().getPixelReader();

        makeHistogramGraphs();
        resetContrastStretchingValues();
        makeContrastStretchingGraphs();

        System.out.println("Revert");
    }

    /**
     * Toggles between providing live and not live feedback on Contrast Stretching changes to the altered image
     */
    public void updateLiveContrastStretching () {

        contrastStretchingIsLive = !contrastStretchingIsLive;
        if (contrastStretchingIsLive) {
            System.out.println("Live Contrast Stretching On");
            updateContrastStretching();
        } else {
            System.out.println("Live Contrast Stretching Off");
        }
    }

    /**
     * Toggles between providing live and not live feedback on altering the Edge Detection Gradient
     */
    public void updateLiveEdgeDetection () {

        edgeDetectionIsLive = !edgeDetectionIsLive;
        if (edgeDetectionIsLive) {
            System.out.println("Live Edge Detection On");
            updateEdgeGradient();
        } else {
            System.out.println("Live Edge Detection Off");
        }
    }

    /**
     * Saves the changes made to the altered image in one tab.
     */
    public void saveTabChanges () {
        tempImage = alteredImage.getImage();
        makeHistogramGraphs();
        makeContrastStretchingGraphs();
        System.out.println("Tab Changes Saved");
    }

    /**
     * Creates the Contrast Stretching graphs for the current mapping of the values
     */
    public void makeContrastStretchingGraphs () {

        XYChart.Series series = new XYChart.Series<>();
        series.setName("Contrast Stretching Mapping");

        double r1 = INITIAL_R1_CONTRAST_STRETCHING_VALUE;
        double s1 = INITIAL_S1_CONTRAST_STRETCHING_VALUE;
        double r2 = INITIAL_R2_CONTRAST_STRETCHING_VALUE;
        double s2 = INITIAL_S2_CONTRAST_STRETCHING_VALUE;

        // The text field contains no data
        if (r1TextField.getText().equals("") || s1TextField.getText().equals("") || r2TextField.getText().equals("")
            || s2TextField.getText().equals("")) {
            System.out.println("No Contrast Stretching Input - Using default values");
        // The text field contains the relevant data
        } else {
            r1 = Double.parseDouble(r1TextField.getText());
            s1 = Double.parseDouble(s1TextField.getText());
            r2 = Double.parseDouble(r2TextField.getText());
            s2 = Double.parseDouble(s2TextField.getText());
        }

        Map<Integer, Integer> contrastStretchingMapping = generateContrastStretchingLookupTable(r1, s1, r2, s2);

        for (int i = 0; i < 256; i++) {
            series.getData().add(new XYChart.Data(contrastStretchingMapping.get(i), i));
        }

        contrastStretchingGraph.getData().clear();
        contrastStretchingGraph.getData().addAll(series);
        System.out.println("Contrast Stretching Graphs Updated");
    }

    /**
     * Updates the Contrast Stretching Coordinates graph with the current values indicated via the sliders.
     */
    public void updateContrastStretchingCoordinatesGraph () {

        XYChart.Series contrastStretchingPoints = new XYChart.Series<>();
        contrastStretchingPoints.setName("R1: " + r1 + " S1: " + s1 + " R2: " + r2 + " S2: " + s2);

        contrastStretchingPoints.getData().add(new XYChart.Data(r1Slider.getValue(), s1Slider.getValue()));
        contrastStretchingPoints.getData().add(new XYChart.Data(r2Slider.getValue(), s2Slider.getValue()));
        contrastStretchingPoints.getData().add(new XYChart.Data(ORIGIN_X, ORIGIN_Y));
        contrastStretchingPoints.getData().add(new XYChart.Data(MAX_X, MAX_Y));

        contrastStretchingCoordinatesGraph.getData().clear();
        contrastStretchingCoordinatesGraph.getData().addAll(contrastStretchingPoints);
    }

    /**
     * Makes all of the relevant histogram graphs.
     */
    public void makeHistogramGraphs () {

        // Display the histogram graphs to the user
        // Red Line Chart
        XYChart.Series seriesOriginalImageRed = new XYChart.Series<>();
        seriesOriginalImageRed.setName("Original Image");
        XYChart.Series seriesAlteredImageRed = new XYChart.Series<>();
        seriesAlteredImageRed.setName("Altered image");

        // Red Bar Chart
        XYChart.Series seriesOriginalImageRedBarChart = new XYChart.Series<>();
        seriesOriginalImageRedBarChart.setName("Original Image");
        XYChart.Series seriesAlteredImageRedBarChart = new XYChart.Series<>();
        seriesAlteredImageRedBarChart.setName("Altered image");

        // Green Line Chart
        XYChart.Series seriesOriginalImageGreen = new XYChart.Series<>();
        seriesOriginalImageGreen.setName("Original Image");
        XYChart.Series seriesAlteredImageGreen = new XYChart.Series<>();
        seriesAlteredImageGreen.setName("Altered image");

        // Green Bar Chart
        XYChart.Series seriesOriginalImageGreenBarChart = new XYChart.Series<>();
        seriesOriginalImageRedBarChart.setName("Original Image");
        XYChart.Series seriesAlteredImageGreenBarChart = new XYChart.Series<>();
        seriesAlteredImageRedBarChart.setName("Altered image");

        // Blue Line Chart
        XYChart.Series seriesOriginalImageBlue = new XYChart.Series<>();
        seriesOriginalImageBlue.setName("Original Image");
        XYChart.Series seriesAlteredImageBlue = new XYChart.Series<>();
        seriesAlteredImageBlue.setName("Altered image");

        // Blue Bar Chart
        XYChart.Series seriesOriginalImageBlueBarChart = new XYChart.Series<>();
        seriesOriginalImageRedBarChart.setName("Original Image");
        XYChart.Series seriesAlteredImageBlueBarChart = new XYChart.Series<>();
        seriesAlteredImageRedBarChart.setName("Altered image");

        // Grey Line Chart
        XYChart.Series seriesOriginalImageGrey = new XYChart.Series<>();
        seriesOriginalImageGrey.setName("Original Image");
        XYChart.Series seriesAlteredImageGrey = new XYChart.Series<>();
        seriesAlteredImageGrey.setName("Altered image");

        // Grey Bar Chart
        XYChart.Series seriesOriginalImageGreyBarChart = new XYChart.Series<>();
        seriesOriginalImageRedBarChart.setName("Original Image");
        XYChart.Series seriesAlteredImageGreyBarChart = new XYChart.Series<>();
        seriesAlteredImageRedBarChart.setName("Altered image");

        // Create the histogram graph data for the original and altered images
        int[][] histogramGraphOriginalImage = histogramGraphCalculation(originalImage.getImage());
        int[][] histogramGraphAlteredImage = histogramGraphCalculation(alteredImage.getImage());

        // Indexes of the relevant histogram graphs
        int red = 0;
        int green = 1;
        int blue = 2;
        int greyscale = 3;

        // Add the data to the original and altered images
        for (int i = 0; i < 256; i++) {
            String stringI = "" + i + "";
            // Red Line Chart
            seriesOriginalImageRed.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][red]));
            seriesAlteredImageRed.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][red]));

            // Red Bar Chart
            seriesOriginalImageRedBarChart.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][red]));
            seriesAlteredImageRedBarChart.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][red]));

            // Green Line Chart
            seriesOriginalImageGreen.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][green]));
            seriesAlteredImageGreen.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][green]));

            // Green Bar Chart
            seriesOriginalImageGreenBarChart.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][green]));
            seriesAlteredImageGreenBarChart.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][green]));

            // Blue Line Chart
            seriesOriginalImageBlue.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][blue]));
            seriesAlteredImageBlue.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][blue]));

            // Blue Bar Chart
            seriesOriginalImageBlueBarChart.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][blue]));
            seriesAlteredImageBlueBarChart.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][blue]));

            // Grey Line Chart
            seriesOriginalImageGrey.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][greyscale]));
            seriesAlteredImageGrey.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][greyscale]));

            // Grey Bar Chart
            seriesOriginalImageGreyBarChart.getData().add(new XYChart.Data(stringI, histogramGraphOriginalImage[i][greyscale]));
            seriesAlteredImageGreyBarChart.getData().add(new XYChart.Data(stringI, histogramGraphAlteredImage[i][greyscale]));
        }

        // Clearing all of the graphs ready for the new input
        // Red Charts
        redChannelGraph.getData().clear();
        redChannelOriginalBarChart.getData().clear();
        redChannelAlteredBarChart.getData().clear();

        // Green Charts
        greenChannelGraph.getData().clear();
        greenChannelOriginalBarChart.getData().clear();
        greenChannelAlteredBarChart.getData().clear();

        // Blue Charts
        blueChannelGraph.getData().clear();
        blueChannelOriginalBarChart.getData().clear();
        blueChannelAlteredBarChart.getData().clear();

        // Grey Charts
        greyscaleGraph.getData().clear();
        greyChannelOriginalBarChart.getData().clear();
        greyChannelAlteredBarChart.getData().clear();

        // Both images are the same images at the start so only one series is needed
        if (originalImage.getImage() == alteredImage.getImage()) {
            // Red Charts
            redChannelGraph.getData().addAll(seriesOriginalImageRed);
            redChannelOriginalBarChart.getData().addAll(seriesOriginalImageRed);
            redChannelAlteredBarChart.getData().addAll(seriesAlteredImageRed);

            // Green Charts
            greenChannelGraph.getData().addAll(seriesOriginalImageGreen);
            greenChannelOriginalBarChart.getData().addAll(seriesOriginalImageGreen);
            greenChannelAlteredBarChart.getData().addAll(seriesAlteredImageGreen);

            // Blue Charts
            blueChannelGraph.getData().addAll(seriesOriginalImageBlue);
            blueChannelOriginalBarChart.getData().addAll(seriesOriginalImageBlue);
            blueChannelAlteredBarChart.getData().addAll(seriesAlteredImageBlue);

            // Grey Charts
            greyscaleGraph.getData().addAll(seriesOriginalImageGrey);
            greyChannelOriginalBarChart.getData().addAll(seriesOriginalImageGrey);
            greyChannelAlteredBarChart.getData().addAll(seriesAlteredImageGrey);

        // Both images are not the same so two series are required
        } else {
            // Red Charts
            redChannelGraph.getData().addAll(seriesOriginalImageRed);
            redChannelGraph.getData().addAll(seriesAlteredImageRed);
            redChannelOriginalBarChart.getData().addAll(seriesOriginalImageRed);
            redChannelAlteredBarChart.getData().addAll(seriesAlteredImageRed);

            // Green Charts
            greenChannelGraph.getData().addAll(seriesOriginalImageGreen);
            greenChannelGraph.getData().addAll(seriesAlteredImageGreen);
            greenChannelOriginalBarChart.getData().addAll(seriesOriginalImageGreen);
            greenChannelAlteredBarChart.getData().addAll(seriesAlteredImageGreen);

            // Blue Charts
            blueChannelGraph.getData().addAll(seriesOriginalImageBlue);
            blueChannelGraph.getData().addAll(seriesAlteredImageBlue);
            blueChannelOriginalBarChart.getData().addAll(seriesOriginalImageBlue);
            blueChannelAlteredBarChart.getData().addAll(seriesAlteredImageBlue);

            // Grey Charts
            greyscaleGraph.getData().addAll(seriesOriginalImageGrey);
            greyscaleGraph.getData().addAll(seriesAlteredImageGrey);
            greyChannelOriginalBarChart.getData().addAll(seriesOriginalImageGrey);
            greyChannelAlteredBarChart.getData().addAll(seriesAlteredImageGrey);
        }
        System.out.println("Histogram Graphs Updated");
    }

    /**
     * Removes control from the alteration of the Contrast Stretching coordinates
     */
    public void removeControl () {

        control = "None";
        System.out.println("Control removed");
    }

    /**
     * Sets the control to the (r1, s1) coordinate on the Contrast Stretching Coordinates Graph
     */
    public void setControlR1S1 () {

        control = "R1S1";
        System.out.println("Control set to R1 S1");
    }

    /**
     * Sets the control to the (r2, s2) coordinate on the Contrast Stretching Coordinates Graph
     */
    public void setControlR2S2 () {

        control = "R2S2";
        System.out.println("Control set to R2 S2");
    }

    /**
     * Calls the relevant function to update the graph with the changed (r1, s1) or (r2, s2) coordinate
     */
    public void activateCurrentControl () {

        // If either of the two toggle buttons is not currently selected, no pairs of coordinates are in control
        if ((!controlR1S1ToggleButton.selectedProperty().getValue()) && control.equalsIgnoreCase("R1S1")) {
            removeControl();
        }

        if ((!controlR2S2ToggleButton.selectedProperty().getValue()) && control.equalsIgnoreCase("R2S2")) {
            removeControl();
        }

        // Control set to the (r1, s1) coordinate
        if (control.equalsIgnoreCase("R1S1")) {
            updateContrastStretchingGraphR1S1();
            //System.out.println("Activate R1 S1");
        // Control set to the (r2, s2) coordinate
        } else if (control.equalsIgnoreCase("R2S2")) {
            updateContrastStretchingGraphR2S2();
            //System.out.println("Activate R2 S2");
        // Control removed
        } else {
            System.out.println("No Control");
        }

        //System.out.println("Update text field");

        // Setting the relevant text fields to their corresponding values
        r1TextField.setText("" + r1 + "");
        s1TextField.setText("" + s1 + "");
        r2TextField.setText("" + r2 + "");
        s2TextField.setText("" + s2 + "");
    }

    /**
     * Updates the Contrast Stretching Coordinates graph with the new (r1, s1) coordinates
     */
    public void updateContrastStretchingGraphR1S1 () {

        final Axis<Number> xAxis = contrastStretchingCoordinatesGraph.getXAxis();
        final Axis<Number> yAxis = contrastStretchingCoordinatesGraph.getYAxis();

        // Monitoring the graph area
        final Node chartBackground = contrastStretchingCoordinatesGraph.lookup(".chart-plot-background");

        // Click to remove control
        chartBackground.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                // No control over the coordinates
                removeControl();
            }
        });

        // Apply the current mouse position coordinates to the (r1, s1) coordinate
        chartBackground.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                // No control
                if (!control.equalsIgnoreCase("R1S1")) {
                    return;
                }

                // Getting the current mouse coordinates
                String xString = String.format("%.0f", xAxis.getValueForDisplay(mouseEvent.getX()));
                String yString = String.format("%.0f", yAxis.getValueForDisplay(mouseEvent.getY()));

                int x = Integer.parseInt(xString);
                int y = Integer.parseInt(yString);

                XYChart.Series contrastStretchingPoints = new XYChart.Series<>();

                // Set r1 and s1 to the new coordinates indicated by the current mouse position on the graph
                r1 = x;
                s1 = y;

                // Naming the graph series
                contrastStretchingPoints.setName("R1: " + r1 + " S1: " + s1 + " R2: " + r2 + " S2: " + s2);

                // Adding the relevant graph points
                contrastStretchingPoints.getData().add(new XYChart.Data(r1, s1));
                contrastStretchingPoints.getData().add(new XYChart.Data(r2, s2));
                contrastStretchingPoints.getData().add(new XYChart.Data(ORIGIN_X, ORIGIN_Y));
                contrastStretchingPoints.getData().add(new XYChart.Data(MAX_X, MAX_Y));

                // Clearing the original graph series and adding the new series
                contrastStretchingCoordinatesGraph.getData().clear();
                contrastStretchingCoordinatesGraph.getData().addAll(contrastStretchingPoints);

                if (contrastStretchingIsLive) {
                    updateContrastStretching();
                }
            }
        });
    }

    /**
     * Updates the Contrast Stretching Coordinates graph with the new (r2, s2) coordinates
     */
    public void updateContrastStretchingGraphR2S2 () {

        final Axis<Number> xAxis = contrastStretchingCoordinatesGraph.getXAxis();
        final Axis<Number> yAxis = contrastStretchingCoordinatesGraph.getYAxis();

        // Monitoring the graph area
        final Node chartBackground = contrastStretchingCoordinatesGraph.lookup(".chart-plot-background");

        // Click to remove control
        chartBackground.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                // No control over the coordinates
                removeControl();
            }
        });

        // Apply the current mouse position coordinates to the (r2, s2) coordinate
        chartBackground.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                // No control
                if (!control.equalsIgnoreCase("R2S2")) {
                    return;
                }

                // Getting the current mouse coordinates
                String xString = String.format("%.0f", xAxis.getValueForDisplay(mouseEvent.getX()));
                String yString = String.format("%.0f", yAxis.getValueForDisplay(mouseEvent.getY()));

                int x = Integer.parseInt(xString);
                int y = Integer.parseInt(yString);

                XYChart.Series contrastStretchingPoints = new XYChart.Series<>();

                // Set r2 and s2 to the new coordinates indicated by the current mouse position on the graph
                r2 = x;
                s2 = y;

                // Naming the graph series
                contrastStretchingPoints.setName("R1: " + r1 + " S1: " + s1 + " R2: " + r2 + " S2: " + s2);

                // Adding the relevant graph points
                contrastStretchingPoints.getData().add(new XYChart.Data(r1, s1));
                contrastStretchingPoints.getData().add(new XYChart.Data(r2, s2));
                contrastStretchingPoints.getData().add(new XYChart.Data(ORIGIN_X, ORIGIN_Y));
                contrastStretchingPoints.getData().add(new XYChart.Data(MAX_X, MAX_Y));

                // Clearing the original graph series and adding the new series
                contrastStretchingCoordinatesGraph.getData().clear();
                contrastStretchingCoordinatesGraph.getData().addAll(contrastStretchingPoints);

                if (contrastStretchingIsLive) {
                    updateContrastStretching();
                }
            }
        });
    }

    /**
     * Removes all of the custom values from the 3 x 3 input grid.
     */
    public void performRemoveCustomValues () {

        a.setText("");
        b.setText("");
        c.setText("");
        d.setText("");
        e.setText("");
        f.setText("");
        g.setText("");
        h.setText("");
        i.setText("");
        System.out.println("Custom Filter Kernel Values Cleared");
    }

    /**
     * Calls the relevant functions to Invert the pixels of the altered image.
     */
    public void performInvert () {

        // Generates the inverted image
        Image invertedImage = imageInversion(alteredImage.getImage());

        // Updates the GUI so that the new image is displayed to the user
        alteredImage.setImage(invertedImage);
       
        System.out.println("Image Inverted");
    }

    /**
     * Calls the relevant functions to apply Gamma Correction to the altered image.
     */
    public void performGammaCorrection () {

        double gammaAdjustmentValue;

        // The text field contains no data
        if (gammaSliderValue.getText().equals("")) {
            System.out.println("No Input");
        // The text field contains the relevant data
        } else {
            gammaAdjustmentValue = Double.parseDouble(gammaSliderValue.getText());
            System.out.println("Gamma Correction Applied to Image");

            // Generates the Gamma Corrected image
            Image gammaCorrectedImage = gammaCorrection(alteredImage.getImage(), gammaAdjustmentValue);

            // Updates the GUI so that the new image is displayed to the user
            alteredImage.setImage(gammaCorrectedImage);
        }
    }

    /**
     * Updates the image with the current Gamma Correction value applied
     */
    public void updateImageGamma () throws FileNotFoundException {

        double gammaAdjustmentValue = 0;

        // The text field contains no data
        if (gammaSliderValue.getText().equals("")) {
            System.out.println("No Input");
            // The text field contains the relevant data
        } else {
            gammaAdjustmentValue = Double.parseDouble(gammaSliderValue.getText());
            System.out.println("Image Gamma Updated");

            // Generates the Gamma Corrected image
            Image gammaCorrectedImage = gammaCorrection(tempImage, gammaAdjustmentValue);

            // Updates the GUI so that the new image is displayed to the user
            alteredImage.setImage(gammaCorrectedImage);
        }

        try {
            updateGammaBarIndicator(gammaAdjustmentValue);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find gamma indicator image");
        }
    }

    /**
     * Updates the Gamma indicator bar with the correct number of bars for the current gammaAdjustmentValue
     *
     * @param gammaAdjustmentValue The current Gamma application percentage. > 50 = lighter, < 50 = darker
     * @throws FileNotFoundException If the image file cannot be found.
     */
    public void updateGammaBarIndicator (double gammaAdjustmentValue) throws FileNotFoundException {

        if (gammaAdjustmentValue > 4) {
            scaleA.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleA.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 8) {
            scaleB.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleB.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 12) {
            scaleC.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleC.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 16) {
            scaleD.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleD.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 20) {
            scaleE.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleE.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 24) {
            scaleF.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleF.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 28) {
            scaleG.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleG.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 32) {
            scaleH.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleH.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 36) {
            scaleI.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleI.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 40) {
            scaleJ.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleJ.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 44) {
            scaleK.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleK.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 48) {
            scaleL.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleL.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 52) {
            scaleM.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleM.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 56) {
            scaleN.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleN.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 60) {
            scaleO.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleO.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 64) {
            scaleP.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleP.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 68) {
            scaleQ.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleQ.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 72) {
            scaleR.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleR.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 76) {
            scaleS.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleS.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 80) {
            scaleT.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleT.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 84) {
            scaleU.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleU.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 88) {
            scaleV.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleV.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 92) {
            scaleW.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleW.setImage(new Image(new FileInputStream("Grey.jpg")));
        }

        if (gammaAdjustmentValue > 96) {
            scaleX.setImage(new Image(new FileInputStream("Amber.jpg")));
        } else {
            scaleX.setImage(new Image(new FileInputStream("Grey.jpg")));
        }
    }

    /**
     * Updates the image with the current selected values for r1, s1, r2 and s2.
     */
    public void updateContrastStretching () {

        double r1;
        double s1;
        double r2;
        double s2;

        // The text field contains no data
        if (r1TextField.getText().equals("") || s1TextField.getText().equals("") || r2TextField.getText().equals("")
            || s2TextField.getText().equals("")) {
            System.out.println("No Input");
            // The text field contains the relevant data
        } else {
            r1 = Double.parseDouble(r1TextField.getText());
            s1 = Double.parseDouble(s1TextField.getText());
            r2 = Double.parseDouble(r2TextField.getText());
            s2 = Double.parseDouble(s2TextField.getText());

            System.out.println("Update Contrast Stretching");

            // Generates the Contrast Stretched image
            Image contrastStretchedImage = contrastStretching(tempImage, r1, s1, r2, s2);

            // Updates the GUI so the new image is displayed to the user
            alteredImage.setImage(contrastStretchedImage);
        }
    }

    /**
     * Performs Contrast Stretching on a image when the same input values are applied multiple times
     */
    public void performConsecutiveContrastStretching () {

        double r1;
        double s1;
        double r2;
        double s2;

        // The text field contains no data
        if (r1TextField.getText().equals("") || s1TextField.getText().equals("") || r2TextField.getText().equals("")
            || s2TextField.getText().equals("")) {
            System.out.println("No Input");
            // The text field contains the relevant data
        } else {
            r1 = Double.parseDouble(r1TextField.getText());
            s1 = Double.parseDouble(s1TextField.getText());
            r2 = Double.parseDouble(r2TextField.getText());
            s2 = Double.parseDouble(s2TextField.getText());

            System.out.println("Update Contrast Stretching");

            // Generates the Contrast Stretched image
            Image contrastStretchedImage = contrastStretching(alteredImage.getImage(), r1, s1, r2, s2);

            // Updates the GUI so the new image is displayed to the user
            alteredImage.setImage(contrastStretchedImage);
        }
        makeContrastStretchingGraphs();
    }

    /**
     * Calls the relevant functions to apply Greyscale Histogram Equalisation to the altered image.
     */
    public void performGreyscaleHistogramEqualisation () {

        int i1;
        int i2;

        // The text field contains no data
        if (i1TextField.getText().equals("") || i2TextField.getText().equals("")) {
            System.out.println("No Input");
            // The text field contains the relevant data
        } else {
            i1 = Integer.parseInt(i1TextField.getText());
            i2 = Integer.parseInt(i2TextField.getText());

            System.out.println("Greyscale Histogram Equalisation");

            // Generates the Greyscale Histogram Equalised image
            Image greyscaleHistogramEqualisedImage = greyscaleHistogramEqualisedImage(i1, i2, alteredImage.getImage());

            // Updates the GUI so the new image is displayed to the user
            alteredImage.setImage(greyscaleHistogramEqualisedImage);
        }
    }

    /**
     * Calls the relevant functions to apply Histogram Equalisation to the altered image.
     */
    public void performHistogramEqualisation () {

        int i1;
        int i2;

        // The text field contains no data
        if (i1TextField.getText().equals("") || i2TextField.getText().equals("")) {
            System.out.println("No Input");
        // The text field contains the relevant data
        } else {
            i1 = Integer.parseInt(i1TextField.getText());
            i2 = Integer.parseInt(i2TextField.getText());

            System.out.println("Histogram Equalisation");

            // Generates the Histogram Equalised image
            Image histogramEqualisedImage = histogramEqualisedImage(i1, i2, alteredImage.getImage());

            // Updates the GUI so the new image is displayed to the user
            alteredImage.setImage(histogramEqualisedImage);
        }
    }

    /**
     * Removes noise from the image.
     */
    public void performFixNoisyImage () {

        System.out.println("Fix Noisy Image");

        // Generates the image with reduced noise
        Image noiseReducedImage = fixNoisyImage(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(noiseReducedImage);
    }

    /**
     * Applies a Low Pass Filter to the image.
     */
    public void performLowPassFilter () {

        System.out.println("Low Pass Filter");

        // Generates the image with a Low Pass Filter applied
        Image lowPassFilterImage = lowPassFilter(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(lowPassFilterImage);
    }

    /**
     * Applies a High Pass Filter to the image.
     */
    public void performHighPassFilter () {

        System.out.println("High Pass Filter");

        // Generates the image with a High Pass Filter applied
        Image highPassFilterImage = highPassFilter(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(highPassFilterImage);
    }

    /**
     * Applies a Sobel Edge Detector to the X axis of the image.
     */
    public void performSobelEdgeDetectorX () {

        System.out.println("Sobel Edge Detector - X");

        // Generates the image with a Sobel Edge Detector applied to it's X axis
        Image sobelEdgeDetectorXImage = sobelEdgeDetectorX(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(sobelEdgeDetectorXImage);
    }

    /**
     * Applies a Sobel Edge Detector to the Y axis of the image.
     */
    public void performSobelEdgeDetectorY () {

        System.out.println("Sobel Edge Detector - Y");

        // Generates the image with a Sobel Edge Detector applied to it's Y axis
        Image sobelEdgeDetectorYImage = sobelEdgeDetectorY(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(sobelEdgeDetectorYImage);
    }

    /**
     * Applies a Blur effect to the image.
     */
    public void performBlur () {

        System.out.println("Blur");

        // Generates the image with the Blur effect applied
        Image burredImage = blur(alteredImage.getImage());

        alteredImage.setImage(burredImage);
    }

    /**
     * Performs Custom Cross Correlation on the image according to the user's choice of Filter Kernel values.
     */
    public void performCustomCrossCorrelation () {

        System.out.println("Custom Cross Correlation");

        // Generates the image with Cross Correlation applied to it
        Image customCrossCorrelationImage = customCrossCorrelation(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(customCrossCorrelationImage);
    }

    /**
     * Applies a Laplacian Matrix to the image.
     */
    public void performLaplacianMatrixApplication () {

        System.out.println("Laplacian Matrix Application");

        // Generates the image with the Laplacian Matrix applied to it
        Image laplacianMatrixAppliedImage = laplacianMatrix(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(laplacianMatrixAppliedImage);
    }

    /**
     * Applies a More Blur effect to the image.
     */
    public void performMoreBlur () {

        System.out.println("More Blur");

        // Generates the image with the More Blur effect applied to it
        Image moreBlurImage = moreBlur(alteredImage.getImage());

        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(moreBlurImage);
    }

    /**
     * Applies a More Blur effect to the image.
     */
    public void performGaussianBlur () {

        System.out.println("Gaussian Blur");
        // Generates the image with the More Blur effect applied to it
        Image gaussianBlurImage = gaussianBlur(alteredImage.getImage());
        // Updates the GUI so the new image is displayed to the user
        alteredImage.setImage(gaussianBlurImage);
    }

    /**
     * Updates the image with the current Edge Detection Gradient applied
     */
    public void updateEdgeGradient () {

        if (edgeDetectionIsLive) {
            System.out.println("Image Outline Updated");
            double gradient = edgeGradientSlider.getValue();
            // Generates the image outline
            Image outlinedImage = findEdges(tempImage, gradient);
            // Updates the GUI so that the new image is displayed to the user
            alteredImage.setImage(outlinedImage);
        }
    }

    /**
     * Alters all of the pixels contained within the input image in order to invert the image.
     *
     * @param image The image to be inverted.
     * @return The inverted image.
     */
    public Image imageInversion(Image image) {

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                Color color = imageReader.getColor(x, y);
                color = Color.color(1.0 - color.getRed(), 1.0 - color.getGreen(), 1.0 - color.getBlue());
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Alters the Gamma of an image by changing every pixel.
     *
     * @param image The image which Gamma Correction will be performed on.
     * @param gammaAdjustmentPercentage The percentage of light / dark Gamma to be adjusted on the altered image.
     *
     * @return The image with appropriate Gamma alterations applied.
     */
    public Image gammaCorrection(Image image, double gammaAdjustmentPercentage) {

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        double gamma;

        // No Change
        if (gammaAdjustmentPercentage == 50) {
            return image;
        // Lighter
        } else if (gammaAdjustmentPercentage > 50) {
            double positiveGammaPercentage = ((gammaAdjustmentPercentage - 50) * 2) / 100;
            gamma = 1 + (10 * positiveGammaPercentage);
        // Darker
        } else {
            double gammaPercentage = (gammaAdjustmentPercentage * 2) / 100;
            gamma = gammaPercentage;
        }

        double oneOverGamma = (1.0 / gamma);

        // Compute all new Gamma values for color values 0 - 255
        Map<Double, Double> gammaDic = new HashMap<>();
        for (double i = 0; i <= 255; i++) {
            gammaDic.put(i, Math.floor((Math.pow((i / 255), oneOverGamma)) * 255));
        }

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                Color color = imageReader.getColor(x, y);
                color = Color.color(gammaDic.get(Math.floor((color.getRed() * 255))) / 255,
                    gammaDic.get((Math.floor((color.getGreen() * 255)))) / 255,
                    gammaDic.get(Math.floor((color.getBlue() * 255))) / 255);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Performs Contrast Stretching on the image.
     *
     * @param image The image which Contrast Stretching will be applied to.
     * @param r1
     * @param s1
     * @param r2
     * @param s2
     *
     * @return The image with Contrast Stretching applied.
     */
    public Image contrastStretching(Image image, double r1, double s1, double r2, double s2) {

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        Map<Integer, Integer> contrastStretchingDic = generateContrastStretchingLookupTable(r1, s1, r2, s2);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                Color color = imageReader.getColor(x, y);
                double newRed = (contrastStretchingDic.get((int)(Math.floor(color.getRed() * 255)))) / 255.0;
                double newGreen = (contrastStretchingDic.get((int)(Math.floor(color.getGreen() * 255)))) / 255.0;
                double newBlue = (contrastStretchingDic.get((int)(Math.floor(color.getBlue() * 255)))) / 255.0;

                color = Color.color(newRed, newGreen, newBlue);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Calls the relevant functions in order to create the Contrast Stretching lookup table.
     *
     * @param r1
     * @param s1
     * @param r2
     * @param s2
     *
     * @return The Contrast Stretching lookup table used to map call pixel intensities.
     */
    public Map<Integer, Integer> generateContrastStretchingLookupTable (double r1, double s1, double r2, double s2) {

        // Compute and add all new Contrast Stretched values for color values in the range 0 - 255
        Map<Integer, Integer> contrastStretchingDic = new HashMap<>();
        for (int i = 0; i <= 255; i++) {
            contrastStretchingDic.put(i, getContrastStretchingValue(r1, s1, r2, s2, i));
        }

        return contrastStretchingDic;
    }

    /**
     * Generates a single Contrast Stretched value for a single intensity.
     *
     * @param r1
     * @param s1
     * @param r2
     * @param s2
     * @param in The input intensity of channel for a certain pixel.
     *
     * @return The single Contrast Stretched value for a single intensity.
     */
    public int getContrastStretchingValue(double r1, double s1, double r2, double s2, double in) {

        int out = 0;

        if (in < r1) {
            out = (int)((s1 / r1) * in);
        } else if (r1 <= in && in <= r2) {
            out = (int)(((s2 - s1) / (r2 - r1)) * (in - r1) + s1);
        } else if (in >= r2) {
            out = (int)(((255 - s2) / (255 - r2)) * (in - r2) + s2);
        }

        return out;
    }

    /**
     * Calculates all of the Histogram Graph values for the red, green, blue
     * channels and a greyscale for all intensities in the range 0 - 255.
     *
     * @param image The image which the graphs will obtain their modelling data from.
     *
     * @return A two dimensional array containing all of the values for all channels and a greyscale.
     */
    public int[][] histogramGraphCalculation (Image image) {

        /* Creating a two dimensional array to store the intensity of the red, green
        and blue color values in addition to the total brightness of each pixel (greyscale) */
        int[][] histogram = new int[256][4];

        // Initialising all values to 0 ready for incrementing / counting
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 256; i++) {
                histogram[i][j] = 0;
            }
        }

        PixelReader pixelReader = image.getPixelReader();

        /* Calculating and populating the values of the histogram for the red, green and blue color
        values in addition to a greyscale value for each of the color values summed */
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                Color color = pixelReader.getColor(i, j);
                int red = (int) (color.getRed() * 255);
                int green = (int) (color.getGreen() * 255);
                int blue = (int) (color.getBlue() * 255);
                int greyscale = (red + green + blue) / 3;

                // Incrementing the count of the relevant intensity for each color channel and the brightness (greyscale)
                histogram[red][0]++;
                histogram[green][1]++;
                histogram[blue][2]++;
                histogram[greyscale][3]++;
            }
        }

        return histogram;
    }

    /**
     * Constructs the Greyscale Histogram image.
     *
     * @param i1
     * @param i2
     * @param image The image which will have Greyscale Histogram Equalisation performed on it.
     *
     * @return The image with Greyscale Histogram Equalisation performed on it.
     */
    public Image greyscaleHistogramEqualisedImage (int i1, int i2, Image image) {

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        // Obtain the mapping for all different intensities in the range 0 - 255
        double mapping[] = histogramEqualisedMapping(i1, i2, image);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                Color color = imageReader.getColor(x, y);

                // Calculate the original intensities
                int originalRed = (int)(Math.floor(color.getRed() * 255));
                int originalGreen = (int)(Math.floor(color.getGreen() * 255));
                int originalBlue = (int)(Math.floor(color.getBlue() * 255));
                int greyscale = (originalRed + originalGreen + originalBlue) / 3;

                // Calculate the new intensities
                double newRed = (mapping[greyscale]) / 255;
                double newGreen = (mapping[greyscale]) / 255;
                double newBlue = (mapping[greyscale]) / 255;

                // Apply the new colour
                color = Color.color(newRed, newGreen, newBlue);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Constructs the Histogram Equalised image.
     *
     * @param i1
     * @param i2
     * @param image The image which will have Histogram Equalisation performed on it.
     *
     * @return The image with Histogram Equalisation applied.
     */
    public Image histogramEqualisedImage (int i1, int i2, Image image) {

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        // Obtain the mapping for all different intensities in the range 0 - 255
        double mapping[] = histogramEqualisedMapping(i1, i2, image);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                Color color = imageReader.getColor(x, y);

                // Calculate the original intensities
                int originalRed = (int)(Math.floor(color.getRed() * 255));
                int originalGreen = (int)(Math.floor(color.getGreen() * 255));
                int originalBlue = (int)(Math.floor(color.getBlue() * 255));

                // Calculate the new intensities
                double newRed = (mapping[originalRed]) / 255;
                double newGreen = (mapping[originalGreen]) / 255;
                double newBlue = (mapping[originalBlue]) / 255;

                // Apply the new colour
                color = Color.color(newRed, newGreen, newBlue);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Calculates all of the values which will be mapped to as part of Histogram Equalisation.
     *
     * @param i1
     * @param i2
     * @param image The image from which the Histogram Equalisation and mapping will constructed for.
     *
     * @return An array containing all of the Histogram Equalised
     *         mapping values as part of performing Histogram Equalisation.
     */
    public double[] histogramEqualisedMapping (double i1, double i2, Image image) {

        double mapping[] = new double[256];

        // Obtain the Histogram Cumulative Distribution Graph of the image
        int t[] = histogramCumulativeDistribution(image);
        double numOfPixels = t[255];

        // Calculate the mapping for all intensities in the range 0 - 255
        for (int i = 0; i < 256; i++) {
            mapping[i] = Math.floor(((i2 - i1) * ((double) t[i] / numOfPixels)) + i1);
        }

        return mapping;
    }

    /**
     * Calculates all of the values for the Histogram Cumulative Distribution as part of Histogram Equalisation.
     *
     * @param image The image from which the Histogram Cumulative Distribution values will be obtained.
     *
     * @return An array containing all of the Histogram Cumulative Distribution values.
     */
    public int[] histogramCumulativeDistribution (Image image) {

        int tGreyscale[] = new int[256];

        // Obtaining the Histogram Graphs
        int [][] histogram = histogramGraphCalculation(image);

        int greyscale = 3;

        tGreyscale[0] = histogram[0][greyscale];

        // Computing the Cumulative Distribution for all intensities in the range 0 - 255
        for (int i = 1; i < 256; i++) {
            tGreyscale[i] = histogram[i][greyscale] + tGreyscale[i - 1];
        }

        return tGreyscale;
    }

    /**
     * Applies Noise Reduction to the image.
     *
     * @param image The image which Noise Reduction will be applied to.
     *
     * @return The image with the Noise Reduction applied to it.
     */
    public Image fixNoisyImage (Image image) {

        String filterKernelType = "noisyFilterKernel";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Low Pass Filter to the image.
     *
     * @param image The image which a Low Pass Filter will be applied to.
     *
     * @return The image with the Low Pass Filter applied to it.
     */
    public Image lowPassFilter (Image image) {

        String filterKernelType = "lowPassKernelFilter";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a High Pass Filter to the image.
     *
     * @param image The image which a High Pass Filter will be applied to.
     *
     * @return The image with the High Pass Filter applied to it.
     */
    public Image highPassFilter (Image image) {

        String filterKernelType = "highPassKernelFilter";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Sobel Edge Detector to the X axis of the image.
     *
     * @param image The image which a Sobel Edge Detector will be applied to it's X axis.
     *
     * @return The image with the Sobel Edge Detector applied to it's X axis.
     */
    public Image sobelEdgeDetectorX (Image image) {

        String filterKernelType = "sobelEdgeDetectorXKernelFilter";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Sobel Edge Detector to the Y axis of the image.
     *
     * @param image The image which a Sobel Edge Detector will be applied to it's Y axis.
     *
     * @return The image with the Sobel Edge Detector applied to it's Y axis.
     */
    public Image sobelEdgeDetectorY (Image image) {

        String filterKernelType = "sobelEdgeDetectorYKernelFilter";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Blur effect to the image.
     *
     * @param image the image which a Blur effect will be applied to.
     *
     * @return The image with the Blur effect applied.
     */
    public Image blur (Image image) {

        String filterKernelType = "blur";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Custom Cross Correlation effect to the image.
     *
     * @param image The image which a Custom Cross Correlation effect will be applied.
     *
     * @return The image with the Custom Cross Correlation effect applied to it
     */
    public Image customCrossCorrelation (Image image) {

        String filterKernelType = "custom";

        double imageModelSumRed[][] = applyFilterKernel(image, "red", filterKernelType);
        double imageModelSumGreen[][] = applyFilterKernel(image, "green", filterKernelType);
        double imageModelSumBlue[][] = applyFilterKernel(image, "blue", filterKernelType);

        // Finding the min and max of all three models for each channel
        double minRed = findMin(imageModelSumRed, height, width, 1);
        double minGreen = findMin(imageModelSumGreen, height, width, 1);
        double minBlue = findMin(imageModelSumBlue, height, width, 1);

        double maxRed = findMax(imageModelSumRed, height, width, 1);
        double maxGreen = findMax(imageModelSumGreen, height, width, 1);
        double maxBlue = findMax(imageModelSumBlue, height, width, 1);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 1);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 1);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 1);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Laplacian Matrix Filter to the image.
     *
     * @param image The image which a Laplacian Matrix Filter will be applied to.
     *
     * @return The image with the Laplacian Matrix Filter applied to it.
     */
    public Image laplacianMatrix (Image image) {

        String filterKernelType = "LaplacianMatrix";

        // Finding the min and max of all three models for each channel
        double imageModelSumRed[][] = apply5X5Matrix(image, "red", filterKernelType);
        double imageModelSumGreen[][] = apply5X5Matrix(image, "green", filterKernelType);
        double imageModelSumBlue[][] = apply5X5Matrix(image, "blue", filterKernelType);

        double minRed = findMin(imageModelSumRed, height, width, 2);
        double minGreen = findMin(imageModelSumGreen, height, width, 2);
        double minBlue = findMin(imageModelSumBlue, height, width, 2);

        double maxRed = findMax(imageModelSumRed, height, width, 2);
        double maxGreen = findMax(imageModelSumGreen, height, width, 2);
        double maxBlue = findMax(imageModelSumBlue, height, width, 2);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 2);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 2);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 2);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }


        return effectAppliedImage;
    }

    /**
     * Applies a More Blur effect to the image.
     *
     * @param image The image which a More Blur effect will be applied to.
     *
     * @return The image with the More Blur effect applied to it.
     */
    public Image moreBlur (Image image) {

        String filterKernelType = "moreBlur";

        // Finding the min and max of all three models for each channel
        double imageModelSumRed[][] = apply5X5Matrix(image, "red", filterKernelType);
        double imageModelSumGreen[][] = apply5X5Matrix(image, "green", filterKernelType);
        double imageModelSumBlue[][] = apply5X5Matrix(image, "blue", filterKernelType);

        double minRed = findMin(imageModelSumRed, height, width, 2);
        double minGreen = findMin(imageModelSumGreen, height, width, 2);
        double minBlue = findMin(imageModelSumBlue, height, width, 2);

        double maxRed = findMax(imageModelSumRed, height, width, 2);
        double maxGreen = findMax(imageModelSumGreen, height, width, 2);
        double maxBlue = findMax(imageModelSumBlue, height, width, 2);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 2);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 2);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 2);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Applies a Gaussian Blur effect to the image.
     *
     * @param image The image which a Gaussian Blur effect will be applied to.
     *
     * @return The image with the Gaussian Blur effect applied to it.
     */
    public Image gaussianBlur (Image image) {

        String filterKernelType = "gaussianBlur";

        // Finding the min and max of all three models for each channel
        double imageModelSumRed[][] = apply5X5Matrix(image, "red", filterKernelType);
        double imageModelSumGreen[][] = apply5X5Matrix(image, "green", filterKernelType);
        double imageModelSumBlue[][] = apply5X5Matrix(image, "blue", filterKernelType);

        double minRed = findMin(imageModelSumRed, height, width, 2);
        double minGreen = findMin(imageModelSumGreen, height, width, 2);
        double minBlue = findMin(imageModelSumBlue, height, width, 2);

        double maxRed = findMax(imageModelSumRed, height, width, 2);
        double maxGreen = findMax(imageModelSumGreen, height, width, 2);
        double maxBlue = findMax(imageModelSumBlue, height, width, 2);

        double min = Math.min(Math.min(minRed, minGreen), Math.min(minGreen, minBlue));
        double max = Math.max(Math.max(maxRed, maxGreen), Math.max(maxGreen, maxBlue));

        // Obtain the new image model for all different intensities in the range 0 - 255
        double newImageModelRed[][] = generateNewImageModel(imageModelSumRed, height, width, min, max, 2);
        double newImageModelGreen[][] = generateNewImageModel(imageModelSumGreen, height, width, min, max, 2);
        double newImageModelBlue[][] = generateNewImageModel(imageModelSumBlue, height, width, min, max, 2);

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // Calculate and apply the new color values to the current pixel
                double newRedColor = (newImageModelRed[y][x]) / 255;
                double newGreenColor = (newImageModelGreen[y][x]) / 255;
                double newBlueColor = (newImageModelBlue[y][x]) / 255;
                Color color = Color.color(newRedColor, newGreenColor, newBlueColor);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Outlines all of the Edges in the image
     *
     * @param image The image where the edges will be searched for
     * @param gradient The value from which all pixels with greater intensities will be made black, and smaller values white
     *
     * @return The image outline
     */
    public Image findEdges (Image image, double gradient) {

        // Iterate over all pixels in the image
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                Color color = imageReader.getColor(x, y);

                // Calculate the original intensities
                int originalRed = (int)(Math.floor(color.getRed() * 255));
                int originalGreen = (int)(Math.floor(color.getGreen() * 255));
                int originalBlue = (int)(Math.floor(color.getBlue() * 255));
                int originalGrey = (originalRed + originalGreen + originalBlue) / 3;

                int newGrey = 255;

                if (originalGrey >= gradient) {
                    newGrey = 0;
                }

                // Apply the new colour
                color = Color.color(newGrey / 255, newGrey / 255, newGrey / 255);
                imageWriter.setColor(x, y, color);
            }
        }

        return effectAppliedImage;
    }

    /**
     * Performs normalisation on the model of the image to map the values to the range 0 - 255
     *
     * @param imageModelSum The image model which will be normalised.
     * @param height The number of pixels in the image's y axis.
     * @param width The number of pixels in the image's x axis.
     * @param min The smallest calculated value in the non-normalised model of the image.
     * @param max The largest calculated value in the non-normalised model of the image.
     * @param borderSize The number of pixels which will be made black because the filter cannot be applied to them.
     *
     * @return The normalised model of the image with each pixel intensity in the range 0 - 255.
     */
    public double[][] generateNewImageModel (double[][] imageModelSum, int height, int width, double min, double max, int borderSize) {

        double[][] newImageModelSum = new double[height][width];

        // Auto fill newImageModelSum with 255 so that all values not used are black (creating a black border)
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                newImageModelSum[y][x] = 0;
            }
        }

        if (borderSize == 2) {
            // Filling the new model sum with the correct corresponding values
            for (int y = 2; y < height - 2; y++) {
                for (int x = 2; x < width - 2; x++) {
                    newImageModelSum[y][x] = ((imageModelSum[y][x] - min) * 255) / (max - min);
                }
            }
        } else {
            // Filling the new model sum with the correct corresponding values
            for (int y = 1; y < height - 1; y++) {
                for (int x = 1; x < width - 1; x++) {
                    newImageModelSum[y][x] = ((imageModelSum[y][x] - min) * 255) / (max - min);
                }
            }
        }

        return newImageModelSum;
    }

    /**
     * Finds the pixel with the smallest calculated value.
     *
     * @param imageModelSum The model of the image after the filter has been applied.
     * @param height The number of pixels in the image's y axis.
     * @param width The number of pixels in the image's x axis.
     * @param borderSize The number of pixels which will be made black because the filter cannot be applied to them.
     *
     * @return A double which is the minimum value out of the image model.
     */
    public double findMin (double[][] imageModelSum, int height, int width, int borderSize) {

        double min;
        double currentMin = imageModelSum[height / 2][width / 2]; // Already performs integer division

        // 3 x 3 filter kernel applied
        if (borderSize == 1) {
            // Finding the min and max values
            for (int y = 1; y < height - 1; y++) {
                for (int x = 1; x < width - 1; x++) {
                    if (imageModelSum[y][x] < currentMin) {
                        currentMin = imageModelSum[y][x];
                    }
                }
            }
            // 5 x 5 matrix applied
        } else {
            // Finding the min and max values
            for (int y = 2; y < height - 2; y++) {
                for (int x = 2; x < width - 2; x++) {
                    if (imageModelSum[y][x] < currentMin) {
                        currentMin = imageModelSum[y][x];
                    }
                }
            }
        }
        min = currentMin;

        return min;
    }

    /**
     * Finds the pixel with the largest calculated value.
     *
     * @param imageModelSum The model of the image after the filter has been applied.
     * @param height The number of pixels in the image's y axis.
     * @param width The number of pixels in the image's x axis.
     * @param borderSize The number of pixels which will be made black because the filter cannot be applied to them.
     *
     * @return A double which is the maximum value out of the image model.
     */
    public double findMax (double[][] imageModelSum, int height, int width, int borderSize) {

        double max;
        double currentMax = imageModelSum[height/2][(width/2)]; // Already performs integer division

        // 3 x 3 filter kernel applied
        if (borderSize == 1) {
            // Finding the min and max values
            for (int y = 1; y < height - 1; y++) {
                for (int x = 1; x < width - 1; x++) {
                    if (imageModelSum[y][x] > currentMax) {
                        currentMax = imageModelSum[y][x];
                    }
                }
            }
            // 5 x 5 matrix applied
        } else {
            // Finding the min and max values
            for (int y = 2; y < height - 2; y++) {
                for (int x = 2; x < width - 2; x++) {
                    if (imageModelSum[y][x] > currentMax) {
                        currentMax = imageModelSum[y][x];
                    }
                }
            }
        }

        max = currentMax;
        return max;
    }

    /**
     * Applies the selected Kernel Filter to the model of the image.
     *
     * @param image The image for which a model will be made and applying the Kernel Filter to.
     * @param color The color channel which is being altered by the selected Kernel Filter.
     * @param filterKernelType The type of Kernel Filter which will be applied to the image model.
     *
     * @return The model of the image with the selected Kernel Filter applied.
     */
    public double[][] applyFilterKernel (Image image, String color, String filterKernelType) {

        double filterKernel[][] = makeNoisyFilterKernel();

        // Obtaining the correct Kernel Filter for the user selected effect
        // Noise Reduction
        if (filterKernelType.equalsIgnoreCase("noisyFilterKernel")) {
            filterKernel = makeNoisyFilterKernel();
        }

        // Low Pass Filter
        if (filterKernelType.equalsIgnoreCase("lowPassKernelFilter")) {
            filterKernel = makeLowPassFilterKernel();
        }

        // High Pass Filter
        if (filterKernelType.equalsIgnoreCase("highPassKernelFilter")) {
            filterKernel = makeHighPassFilterKernel();
        }

        // Sobel Edge Detector - X
        if (filterKernelType.equalsIgnoreCase("sobelEdgeDetectorXKernelFilter")) {
            filterKernel = makeSobelEdgeDetectorXFilterKernel();
        }

        // Sobel Edge Detector - Y
        if (filterKernelType.equalsIgnoreCase("sobelEdgeDetectorYKernelFilter")) {
            filterKernel = makeSobelEdgeDetectorYFilterKernel();
        }

        // Blur
        if (filterKernelType.equalsIgnoreCase("blur")) {
            filterKernel = makeBlurFilterKernel();
        }

        // Custom Kernel Filter Values
        if (filterKernelType.equalsIgnoreCase("custom")) {
            filterKernel = makeCustomFilterKernel();
        }

        double imageModel[][] = {{0.0}, {0.0}};

        // Obtaining the correct model image for the corresponding color channel that is being working on
        // Red
        if (color.equalsIgnoreCase("red")) {
            imageModel = modelImageRed(image);
        // Green
        } else if (color.equalsIgnoreCase("green")) {
            imageModel = modelImageGreen(image);
        // Blue
        } else if (color.equalsIgnoreCase("blue")) {
            imageModel = modelImageBlue(image);
        }

        // The new model sum
        double newImageModelSum[][] = new double[height][width];

        // Kernel Filter index codes
        // Row 0
        int faay = 0;
        int faax = 0;

        int faby = 0;
        int fabx = 1;

        int facy = 0;
        int facx = 2;

        // Row 1
        int fbay = 1;
        int fbax = 0;

        int fbby = 1;
        int fbbx = 1;

        int fbcy = 1;
        int fbcx = 2;

        // Row 2
        int fcay = 2;
        int fcax = 0;

        int fcby = 2;
        int fcbx = 1;

        int fccy = 2;
        int fccx = 2;

        for (int y = 1; y < height - 1; y++) {
            for (int x = 1; x < width - 1; x++) {

                // Model image index codes
                // Row 0
                int aay = y - 1;
                int aax = x - 1;

                int aby = y - 1;
                int abx = x;

                int acy = y - 1;
                int acx = x + 1;

                // Row 1
                int bay = y;
                int bax = x - 1;

                int bby = y;
                int bbx = x;

                int bcy = y;
                int bcx = x + 1;

                // Row 2
                int cay = y + 1;
                int cax = x - 1;

                int cby = y + 1;
                int cbx = x;

                int ccy = y + 1;
                int ccx = x + 1;

                double a = (imageModel[aay][aax] * filterKernel[faay][faax]);
                double b = (imageModel[aby][abx] * filterKernel[faby][fabx]);
                double c = (imageModel[acy][acx] * filterKernel[facy][facx]);
                double d = (imageModel[bay][bax] * filterKernel[fbay][fbax]);
                double e = (imageModel[bby][bbx] * filterKernel[fbby][fbbx]);
                double f = (imageModel[bcy][bcx] * filterKernel[fbcy][fbcx]);
                double g = (imageModel[cay][cax] * filterKernel[fcay][fcax]);
                double h = (imageModel[cby][cbx] * filterKernel[fcby][fcbx]);
                double i = (imageModel[ccy][ccx] * filterKernel[fccy][fccx]);

                double sum = a + b + c + d + e + f + g + h + i;
                newImageModelSum[y][x] = sum;
            }
        }

        return newImageModelSum;
    }

    /**
     * Applies the Laplacian Matrix to the model of the image.
     *
     * @param image The image for which a model will be made and applying the Laplacian Matrix to.
     * @param color The color channel which is being altered by the Laplacian Matrix.
     * @return
     */
    public double[][] apply5X5Matrix(Image image, String color, String filter5X5MatrixType) {

        double filter5X5Matrix[][] = {{}, {}};

        if (filter5X5MatrixType.equalsIgnoreCase("laplacianMatrix")) {
            filter5X5Matrix = makeLaplacianMatrix();
        }

        if (filter5X5MatrixType.equalsIgnoreCase("moreBlur")) {
            filter5X5Matrix = makeMoreBlurMatrix();
        }

        if (filter5X5MatrixType.equalsIgnoreCase("gaussianBlur")) {
            filter5X5Matrix = makeGaussianBlurMartix();
        }

        double imageModel[][] = {{0.0}, {0.0}};

        // Obtaining the correct model image for the corresponding color channel that is being working on
        // Red
        if (color.equalsIgnoreCase("red")) {
            imageModel = modelImageRed(image);
        // Green
        } else if (color.equalsIgnoreCase("green")) {
            imageModel = modelImageGreen(image);
        // Blue
        } else if (color.equalsIgnoreCase("blue")) {
            imageModel = modelImageBlue(image);
        // Greyscale
        } else if (color.equalsIgnoreCase("greyscale")) {
            imageModel = modelImageGreyscale(image);
        }

        // 5X5 Matrix index codes
        // Row 0
        int faay = 0;
        int faax = 0;

        int faby = 0;
        int fabx = 1;

        int facy = 0;
        int facx = 2;

        int fady = 0;
        int fadx = 3;

        int faey = 0;
        int faex = 4;

        // Row 1
        int fbay = 1;
        int fbax = 0;

        int fbby = 1;
        int fbbx = 1;

        int fbcy = 1;
        int fbcx = 2;

        int fbdy = 1;
        int fbdx = 3;

        int fbey = 1;
        int fbex = 4;

        // Row 2
        int fcay = 2;
        int fcax = 0;

        int fcby = 2;
        int fcbx = 1;

        int fccy = 2;
        int fccx = 2;

        int fcdy = 2;
        int fcdx = 3;

        int fcey = 2;
        int fcex = 4;

        // Row 3
        int fday = 3;
        int fdax = 0;

        int fdby = 3;
        int fdbx = 1;

        int fdcy = 3;
        int fdcx = 2;

        int fddy = 3;
        int fddx = 3;

        int fdey = 3;
        int fdex = 4;

        // Row 4
        int feay = 4;
        int feax = 0;

        int feby = 4;
        int febx = 1;

        int fecy = 4;
        int fecx = 2;

        int fedy = 4;
        int fedx = 3;

        int feey = 4;
        int feex = 4;

        // The new model sum
        double newImageModelSum[][] = new double[height][width];

        for (int y = 2; y < height - 2; y++) {
            for (int x = 2; x < width - 2; x++) {

                // Model image index codes
                // Row 0
                int aay = y - 2;
                int aax = x - 2;

                int aby = y - 2;
                int abx = x - 1;

                int acy = y - 2;
                int acx = x;

                int ady = y - 2;
                int adx = x + 1;

                int aey = y - 2;
                int aex = x + 2;

                // Row 1
                int bay = y - 1;
                int bax = x - 2;

                int bby = y - 1;
                int bbx = x - 1;

                int bcy = y - 1;
                int bcx = x;

                int bdy = y - 1;
                int bdx = x + 1;

                int bey = y - 1;
                int bex = x + 2;

                // Row 2
                int cay = y;
                int cax = x - 2;

                int cby = y;
                int cbx = x - 1;

                int ccy = y;
                int ccx = x;

                int cdy = y;
                int cdx = x + 1;

                int cey = y;
                int cex = x + 2;

                // Row 3
                int day = y + 1;
                int dax = x - 2;

                int dby = y + 1;
                int dbx = x - 1;

                int dcy = y + 1;
                int dcx = x;

                int ddy = y + 1;
                int ddx = x + 1;

                int dey = y + 1;
                int dex = x + 2;

                // Row 4
                int eay = y + 2;
                int eax = x - 2;

                int eby = y + 2;
                int ebx = x - 1;

                int ecy = y + 2;
                int ecx = x;

                int edy = y + 2;
                int edx = x + 1;

                int eey = y + 2;
                int eex = x + 2;

                double aa = (imageModel[aay][aax] * filter5X5Matrix[faay][faax]);
                double ab = (imageModel[aby][abx] * filter5X5Matrix[faby][fabx]);
                double ac = (imageModel[acy][acx] * filter5X5Matrix[facy][facx]);
                double ad = (imageModel[ady][adx] * filter5X5Matrix[fady][fadx]);
                double ae = (imageModel[aey][aex] * filter5X5Matrix[faey][faex]);
                double ba = (imageModel[bay][bax] * filter5X5Matrix[fbay][fbax]);
                double bb = (imageModel[bby][bbx] * filter5X5Matrix[fbby][fbbx]);
                double bc = (imageModel[bcy][bcx] * filter5X5Matrix[fbcy][fbcx]);
                double bd = (imageModel[bdy][bdx] * filter5X5Matrix[fbdy][fbdx]);
                double be = (imageModel[bey][bex] * filter5X5Matrix[fbey][fbex]);
                double ca = (imageModel[cay][cax] * filter5X5Matrix[fcay][fcax]);
                double cb = (imageModel[cby][cbx] * filter5X5Matrix[fcby][fcbx]);
                double cc = (imageModel[ccy][ccx] * filter5X5Matrix[fccy][fccx]);
                double cd = (imageModel[cdy][cdx] * filter5X5Matrix[fcdy][fcdx]);
                double ce = (imageModel[cey][cex] * filter5X5Matrix[fcey][fcex]);
                double da = (imageModel[day][dax] * filter5X5Matrix[fday][fdax]);
                double db = (imageModel[dby][dbx] * filter5X5Matrix[fdby][fdbx]);
                double dc = (imageModel[dcy][dcx] * filter5X5Matrix[fdcy][fdcx]);
                double dd = (imageModel[ddy][ddx] * filter5X5Matrix[fddy][fddx]);
                double de = (imageModel[dey][dex] * filter5X5Matrix[fdey][fdex]);
                double ea = (imageModel[eay][eax] * filter5X5Matrix[feay][feax]);
                double eb = (imageModel[eby][ebx] * filter5X5Matrix[feby][febx]);
                double ec = (imageModel[ecy][ecx] * filter5X5Matrix[fecy][fecx]);
                double ed = (imageModel[edy][edx] * filter5X5Matrix[fedy][fedx]);
                double ee = (imageModel[eey][eex] * filter5X5Matrix[feey][feex]);

                double sum = aa + ab + ac + ad + ae + ba + bb + bc + bd + be + ca + cb + cc + cd + ce + da + db +
                    dc + dd + de + ea + eb + ec + ed + ee;
                newImageModelSum[y][x] = sum;
            }
        }

        return newImageModelSum;
    }

    /**
     * Constructs the Filter Kernel using the appropriate values for applying Noise Reduction to an image.
     *
     * @return The Filter Kernel to reduce Noise in an image.
     */
    public double[][] makeNoisyFilterKernel () {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = 1;
        filterKernel[0][1] = 3;
        filterKernel[0][2] = 1;
        filterKernel[1][0] = 3;
        filterKernel[1][1] = 9;
        filterKernel[1][2] = 3;
        filterKernel[2][0] = 1;
        filterKernel[2][1] = 3;
        filterKernel[2][2] = 1;

        return filterKernel;
    }

    /**
     * Constructs the Filter Kernel using the appropriate values for applying a Low Pass Filter to the image.
     *
     * @return The Filter Kernel to apply a Low Pass Filter to the image.
     */
    public double[][] makeLowPassFilterKernel() {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = 1;
        filterKernel[0][1] = 1;
        filterKernel[0][2] = 1;
        filterKernel[1][0] = 1;
        filterKernel[1][1] = 1;
        filterKernel[1][2] = 1;
        filterKernel[2][0] = 1;
        filterKernel[2][1] = 1;
        filterKernel[2][2] = 1;

        return filterKernel;
    }

    /**
     * Constructs the Filter Kernel using the appropriate values for applying a High Pass Filter to the image.
     *
     * @return The Filter Kernel to apply a High Pass Filter to the image.
     */
    public double[][] makeHighPassFilterKernel() {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = -1;
        filterKernel[0][1] = -1;
        filterKernel[0][2] = -1;
        filterKernel[1][0] = -1;
        filterKernel[1][1] = 8;
        filterKernel[1][2] = -1;
        filterKernel[2][0] = -1;
        filterKernel[2][1] = -1;
        filterKernel[2][2] = -1;

        return filterKernel;
    }

    /**
     * Constructs the Filter Kernel using the appropriate values
     * for applying a Sobel Edge Detector to the X axis of the image.
     *
     * @return The Filter Kernel to apply a Sobel Edge Detector to the X axis of the image.
     */
    public double[][] makeSobelEdgeDetectorXFilterKernel() {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = -1;
        filterKernel[0][1] = 0;
        filterKernel[0][2] = 1;
        filterKernel[1][0] = -2;
        filterKernel[1][1] = 0;
        filterKernel[1][2] = 2;
        filterKernel[2][0] = -1;
        filterKernel[2][1] = 0;
        filterKernel[2][2] = 1;

        return filterKernel;
    }

    /**
     * Constructs the Filter Kernel using the appropriate values
     * for applying a Sobel Edge Detector to the Y axis of the image.
     *
     * @return The Filter Kernel to apply a Sobel Edge Detector to the Y axis of the image.
     */
    public double[][] makeSobelEdgeDetectorYFilterKernel() {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = 1;
        filterKernel[0][1] = 2;
        filterKernel[0][2] = 1;
        filterKernel[1][0] = 0;
        filterKernel[1][1] = 0;
        filterKernel[1][2] = 0;
        filterKernel[2][0] = -1;
        filterKernel[2][1] = -2;
        filterKernel[2][2] = -1;

        return filterKernel;
    }

    /**
     * Constructs the Filter Kernel using the appropriate values
     * for applying a Blur effect to the image.
     *
     * @return The Filter Kernel to apply a Blur effect to the image.
     */
    public double[][] makeBlurFilterKernel() {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = 1;
        filterKernel[0][1] = 1;
        filterKernel[0][2] = 1;
        filterKernel[1][0] = 1;
        filterKernel[1][1] = 1;
        filterKernel[1][2] = 1;
        filterKernel[2][0] = 1;
        filterKernel[2][1] = 1;
        filterKernel[2][2] = 1;

        return filterKernel;
    }

    /**
     * Constructs the Filter Kernel using the appropriate user specified
     * values for applying a custom user selected effect to the image.
     *
     * @return The Filter Kernel to apply the user specified effect to the image.
     */
    public double[][] makeCustomFilterKernel () {

        int filterKernelSize = 3;

        double filterKernel[][] = new double[filterKernelSize][filterKernelSize];

        // Adding the appropriate values to the Filter Kernel
        filterKernel[0][0] = Integer.parseInt(a.getText());
        filterKernel[0][1] = Integer.parseInt(b.getText());
        filterKernel[0][2] = Integer.parseInt(c.getText());
        filterKernel[1][0] = Integer.parseInt(d.getText());
        filterKernel[1][1] = Integer.parseInt(e.getText());
        filterKernel[1][2] = Integer.parseInt(f.getText());
        filterKernel[2][0] = Integer.parseInt(g.getText());
        filterKernel[2][1] = Integer.parseInt(h.getText());
        filterKernel[2][2] = Integer.parseInt(i.getText());

        return filterKernel;
    }

    /**
     * Constructs the Laplacian Matrix using the appropriate values.
     *
     * @return The Laplacian Matrix to apply to the image.
     */
    public double[][] makeLaplacianMatrix () {

        int laplacianMatrixSize = 5;

        double laplacianMatrix[][] = new double[laplacianMatrixSize][laplacianMatrixSize];

        // Adding the appropriate values to the Laplacian Matrix
        // Row 0
        laplacianMatrix[0][0] = -4;
        laplacianMatrix[0][1] = -1;
        laplacianMatrix[0][2] = 0;
        laplacianMatrix[0][3] = -1;
        laplacianMatrix[0][4] = -4;

        // Row 1
        laplacianMatrix[1][0] = -1;
        laplacianMatrix[1][1] = 2;
        laplacianMatrix[1][2] = 3;
        laplacianMatrix[1][3] = 2;
        laplacianMatrix[1][4] = -1;

        // Row 2
        laplacianMatrix[2][0] = 0;
        laplacianMatrix[2][1] = 3;
        laplacianMatrix[2][2] = 4;
        laplacianMatrix[2][3] = 3;
        laplacianMatrix[2][4] = 0;

        // Row 3
        laplacianMatrix[3][0] = -1;
        laplacianMatrix[3][1] = 2;
        laplacianMatrix[3][2] = 3;
        laplacianMatrix[3][3] = 2;
        laplacianMatrix[3][4] = -1;

        // Row 4
        laplacianMatrix[4][0] = -4;
        laplacianMatrix[4][1] = -1;
        laplacianMatrix[4][2] = 0;
        laplacianMatrix[4][3] = -1;
        laplacianMatrix[4][4] = -4;

        return laplacianMatrix;
    }

    /**
     * Constructs the Blur Matrix using the appropriate values.
     *
     * @return The More Blur Matrix.
     */
    public double[][] makeMoreBlurMatrix() {

        int blurMatrixSize = 5;

        double blurMatrix[][] = new double[blurMatrixSize][blurMatrixSize];

        // Adding the appropriate values to the Blur Matrix
        // Row 0
        blurMatrix[0][0] = 1;
        blurMatrix[0][1] = 1;
        blurMatrix[0][2] = 1;
        blurMatrix[0][3] = 1;
        blurMatrix[0][4] = 1;

        // Row 1
        blurMatrix[1][0] = 1;
        blurMatrix[1][1] = 1;
        blurMatrix[1][2] = 1;
        blurMatrix[1][3] = 1;
        blurMatrix[1][4] = 1;

        // Row 2
        blurMatrix[2][0] = 1;
        blurMatrix[2][1] = 1;
        blurMatrix[2][2] = 1;
        blurMatrix[2][3] = 1;
        blurMatrix[2][4] = 1;

        // Row 3
        blurMatrix[3][0] = 1;
        blurMatrix[3][1] = 1;
        blurMatrix[3][2] = 1;
        blurMatrix[3][3] = 1;
        blurMatrix[3][4] = 1;

        // Row 4
        blurMatrix[4][0] = 1;
        blurMatrix[4][1] = 1;
        blurMatrix[4][2] = 1;
        blurMatrix[4][3] = 1;
        blurMatrix[4][4] = 1;

        return blurMatrix;
    }

    /**
     * Constructs the Gaussian Blur Matrix using the appropriate values.
     *
     * @return The Gaussian Blur matrix.
     */
    public double[][] makeGaussianBlurMartix() {

        int gaussianBlurMatrixSize = 5;

        double gaussianBlurMatrix[][] = new double[gaussianBlurMatrixSize][gaussianBlurMatrixSize];

        // Adding the appropriate values to the Gaussian Blur Matrix
        // Row 0
        gaussianBlurMatrix[0][0] = 1;
        gaussianBlurMatrix[0][1] = 4;
        gaussianBlurMatrix[0][2] = 7;
        gaussianBlurMatrix[0][3] = 4;
        gaussianBlurMatrix[0][4] = 1;

        // Row 1
        gaussianBlurMatrix[1][0] = 4;
        gaussianBlurMatrix[1][1] = 16;
        gaussianBlurMatrix[1][2] = 26;
        gaussianBlurMatrix[1][3] = 16;
        gaussianBlurMatrix[1][4] = 4;

        // Row 2
        gaussianBlurMatrix[2][0] = 7;
        gaussianBlurMatrix[2][1] = 26;
        gaussianBlurMatrix[2][2] = 41;
        gaussianBlurMatrix[2][3] = 26;
        gaussianBlurMatrix[2][4] = 7;

        // Row 3
        gaussianBlurMatrix[3][0] = 4;
        gaussianBlurMatrix[3][1] = 16;
        gaussianBlurMatrix[3][2] = 26;
        gaussianBlurMatrix[3][3] = 16;
        gaussianBlurMatrix[3][4] = 4;

        // Row 4
        gaussianBlurMatrix[4][0] = 1;
        gaussianBlurMatrix[4][1] = 4;
        gaussianBlurMatrix[4][2] = 7;
        gaussianBlurMatrix[4][3] = 4;
        gaussianBlurMatrix[4][4] = 1;

        return gaussianBlurMatrix;
    }

    /**
     * Converts the image into a two dimensional array of red channel intensities.
     *
     * @param image The image which is being modelled.
     *
     * @return The image converted into a two dimensional array of the red channel intensities for each pixel.
     */
    public double[][] modelImageRed (Image image) {

        double imageModel[][] = new double[height][width];

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // For each pixel, get the colour
                Color color = imageReader.getColor(x, y);
                double red = Math.floor(color.getRed() * 255);
                imageModel[y][x] = red;
            }
        }

        return imageModel;
    }

    /**
     * Converts the image into a two dimensional array of green channel intensities.
     *
     * @param image The image which is being modelled.
     *
     * @return The image converted into a two dimensional array of the green channel intensities for each pixel.
     */
    public double[][] modelImageGreen (Image image) {

        double imageModel[][] = new double[height][width];

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // For each pixel, get the colour
                Color color = imageReader.getColor(x, y);
                double green = Math.floor(color.getGreen() * 255);
                imageModel[y][x] = green;
            }
        }

        return imageModel;
    }

    /**
     * Converts the image into a two dimensional array of blue channel intensities.
     *
     * @param image The image which is being modelled.
     *
     * @return The image converted into a two dimensional array of the blue channel intensities for each pixel.
     */
    public double[][] modelImageBlue (Image image) {

        double imageModel[][] = new double[height][width];

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // For each pixel, get the colour
                Color color = imageReader.getColor(x, y);
                double blue = Math.floor(color.getBlue() * 255);
                imageModel[y][x] = blue;
            }
        }

        return imageModel;
    }

    /**
     * Converts the image into a two dimensional array of the brightness of each pixel.
     *
     * @param image The image which is being modelled.
     *
     * @return The image converted into a two dimensional array of the brightness of each pixel.
     */
    public double[][] modelImageGreyscale (Image image) {

        double imageModel[][] = new double[height][width];

        // Read the pixel data from the image passed in
        imageReader = image.getPixelReader();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                // For each pixel, get the colour
                Color color = imageReader.getColor(x, y);
                double red = Math.floor(color.getRed() * 255);
                double green = Math.floor(color.getGreen() * 255);
                double blue = Math.floor(color.getBlue() * 255);

                double greyscale = Math.floor((red + green + blue) / 3);

                imageModel[y][x] = greyscale;
            }
        }

        return imageModel;
    }
}