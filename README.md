# Tumour-Classification-Using-Machine-Learning
In this project, I make use of my own artificial neural network library to train a neural network to classify tumours as malignant or benign (i.e. cancerous or not).
My system outperforms dermatologists (who perform at 65-80% accuracy) and some recent state of the art attempts (with benchmark systems from 2016 and 2017 achieving 79% accuracy).
My system has a classification accuracy of 82.6 percent. Although it is slightly less accurate than the best systems, which achieve an accuracy of 93 percent.
My system was trained using 2600 training images, using a batch size of 64, the ADAM optimiser (with a learning rate of 0.001). ReLU is used in every layer bar the output layer,
which uses a softmax activation. Categorical cross entropy loss is used. 660 testing images are used (with the dataset being provided by the ISIC archive).
The network is very large and no image compression techniques are employed as I found that they harmed the network accuracy too much to justify the faster training time.
This project consists of a visualisation tool that demonstrates how the final network performs, although the code used to learn is provided although commented out.
Optimisations have been made to the visualisation tool for this specific network. My network consists of seven layers (including the output and input layer),
with the layers having 150528, 170, 800, 800, 500, 100 and 2 neurons. Every neuron also has a bias. Xavier initialisation is used. All code was written by me.
Sources:
Data from ISIC Archive obtained here: https://www.kaggle.com/fanconic/skin-cancer-malignant-vs-benign
Recent state of the art convoloutional net with roughly 93% accuracy (also shows summary of all state of the art attempts) : Sagaer, A and Jacob,D. Convolutional Neural Networks for Classifying Melanoma Images. Link: https://abhinavsagar.github.io/files/skin_cnn.pdf
2017 net with precision of 79 percent: R. Lopez, X. Giro-i Nieto, J. Burdick, and O. Marques. Skin lesion classification from dermoscopic images using deep learning techniques. In 2017 13th IASTED international 
conference on biomedical engineering (BioMed), pages 49–54. IEEE, 2017. Link: https://upcommons.upc.edu/bitstream/handle/2117/103386/biomed-2017-paper.pdf;jsessionid=9104F701F155BC154C9A231FB22EFE6D?sequence=1
Accuracy of dermatologists in skin cancer detection: G. Argenziano and H. P. Soyer, “Dermoscopy of pigmented skin lesions–a valuable tool for early diagnosis of melanoma,” The Lancet Oncology, vol. 2, no. 7, pp. 443–449, 2001.
Link: https://moh-it.pure.elsevier.com/en/publications/dermoscopy-of-pigmented-skin-lesions-a-valuable-tool-for-early-di
Execute the JAR file to see the project in operation. This project was made using the  NetBeans 8.2 IDE.



