package com.example.biologyquizapplication.model;

import java.util.ArrayList;
import java.util.Random;

public class QuestionDataAccess {
    private final ArrayList<Question> questions;
    private final ArrayList<Question> generator;

    public QuestionDataAccess() {
        questions = new ArrayList<>();
        populateList();

        System.out.println("GENERATOR REACHED");
        generator = new ArrayList<>(questions);
    }

    private void populateList() {
        questions.add(new Question("What is the largest organ in the human body?",
                new String[]{"Liver", "Heart", "Lungs", "Skin"},
                3));
        questions.add(new Question("What is the powerhouse of the cell?",
                new String[]{"Nucleus", "Mitochondria", "Golgi apparatus", "Endoplasmic reticulum"},
                1));
        questions.add(new Question("Which gas is most abundant in the Earth's atmosphere?",
                new String[]{"Oxygen", "Carbon dioxide", "Nitrogen", "Argon"},
                2));
        questions.add(new Question("What is the smallest unit of life called?",
                new String[]{"Molecule", "Cell", "Atom", "Organ"},
                1));
        questions.add(new Question("What is the process by which plants make their food called?",
                new String[]{"Photosynthesis", "Respiration", "Digestion", "Transpiration"},
                0));
        questions.add(new Question("What is the main function of the white blood cells in the human body?"
                , new String[]{"Transport oxygen", "Fight infection", "Carry nutrients", "Remove waste"},
                1));
        questions.add(new Question("What is the name of the largest artery in the human body?",
                new String[]{"Aorta", "Vena cava", "Pulmonary artery", "Coronary artery"},
                0));
        questions.add(new Question("What is the name of the pigment that gives human skin its color?",
                new String[]{"Melanin", "Keratin", "Collagen", "Elastin"},
                0));
        questions.add(new Question("What is the name of the tiny sacs in the lungs where oxygen is exchanged for carbon dioxide?",
                new String[]{"Bronchi", "Bronchioles", "Alveoli", "Pleura"},
                2));
        questions.add(new Question("Which part of the human brain is responsible for controlling movement and coordination?",
                new String[]{"Cerebellum", "Cerebrum", "Brainstem", "Thalamus"},
                0));
        questions.add(new Question("Which of the following is not a type of blood vessel?",
                new String[]{"Artery", "Vein", "Capillary", "Muscle"},
                3));
        questions.add(new Question("Which of the following is not a type of bone in the human body?",
                new String[]{"Femur", "Humerus", "Malleus", "Fibula"},
                2));
        questions.add(new Question("Which of the following is not a sense that humans have?",
                new String[]{"Echolocation", "Magnetoreception", "Vision", "Hearing"},
                1));
        questions.add(new Question("What is the name of the tiny hair-like structures on the surface of some cells that move in a coordinated way to create movement?",
                new String[]{"Flagella", "Cilia", "Microvilli", "Villi"},
                1));
        questions.add(new Question("Which of the following is not a type of muscle in the human body?",
                new String[]{"Skeletal", "Cardiac", "Smooth", "Adipose"},
                3));
        questions.add(new Question("Which of the following is not a type of joint in the human body?",
                new String[]{"Hinge", "Ball and socket", "Gliding", "Saddle"},
                3));
        questions.add(new Question("What is the name of the hormone that regulates blood sugar levels in the human body?",
                new String[]{"Insulin", "Glucagon", "Adrenaline", "Estrogen"},
                0));
        questions.add(new Question("Which of the following is not a type of blood cell?",
                new String[]{"Red blood cell", "White blood cell", "Platelet", "Plasma"},
                3));
        questions.add(new Question("What is the name of the process by which proteins are made in the cell?",
                new String[]{"Transcription", "Translation", "Replication", "Transformation"},
                1));
        questions.add(new Question("What is the name of the sac-like organ in the human body that stores bile?",
                new String[]{"Gallbladder", "Pancreas", "Spleen", "Liver"},
                0));
        questions.add(new Question("What is the name of the tissue that connects muscles to bones?",
                new String[]{"Tendon", "Ligament", "Cartilage", "Synapse"},
                0));
        questions.add(new Question("What is the name of the tiny structures in the kidney that filter waste from the blood?",
                new String[]{"Nephrons", "Alveoli", "Bronchioles", "Villi"},
                0));
        questions.add(new Question("What is the name of the hormone that stimulates milk production in female mammals?",
                new String[]{"Prolactin", "Estrogen", "Progesterone", "Testosterone"},
                0));
        questions.add(new Question("Which of the following is not a type of blood vessel?",
                new String[]{"Lymphatic vessel", "Artery", "Vein", "Capillary"},
                0));
        questions.add(new Question("Which of the following is not a type of connective tissue in the human body?",
                new String[]{"Cartilage", "Adipose", "Epithelial", "Fibrous"},
                2));
        questions.add(new Question("What is the name of the condition in which the airways in the lungs become inflamed and narrowed, making breathing difficult?",
                new String[]{"Asthma", "Bronchitis", "Emphysema", "Tuberculosis"},
                0));
        questions.add(new Question("What is the name of the hormone that is released during fight or flight response?",
                new String[]{"Adrenaline", "Noradrenaline", "Cortisol", "Testosterone"},
                0));
        questions.add(new Question("What is the name of the process by which plants convert light energy into chemical energy?",
                new String[]{"Photosynthesis", "Respiration", "Fermentation", "Glycolysis"},
                0));
        questions.add(new Question("What is the name of the hormone that regulates salt and water balance in the human body?",
                new String[]{"Aldosterone", "Vasopressin", "Oxytocin", "Thyroid hormone"},
                0));
        questions.add(new Question("What is the name of the valve that separates the left atrium from the left ventricle in the heart?",
                new String[]{"Bicuspid valve", "Tricuspid valve", "Aortic valve", "Pulmonary valve"},
                0));
        questions.add(new Question("What is the name of the hormone that regulates sleep and wakefulness in the human body?",
                new String[]{"Melatonin", "Serotonin", "Dopamine", "Adenosine"},
                0));
        questions.add(new Question("Which of the following is not a type of muscle fiber in the human body?",
                new String[]{"Type I", "Type IIa", "Type IIb", "Type IV"},
                3));
        questions.add(new Question("What is the name of the condition in which the bones become brittle and fragile?",
                new String[]{"Osteoporosis", "Arthritis", "Scoliosis", "Osteoarthritis"},
                0));
        questions.add(new Question("What is the name of the hormone that stimulates the development of female secondary sexual characteristics?",
                new String[]{"Estrogen", "Testosterone", "Progesterone", "Androgen"},
                0));
        questions.add(new Question("What is the name of the process by which red blood cells are produced in the bone marrow?",
                new String[]{"Erythropoiesis", "Thrombopoiesis", "Leukopoiesis", "Hematopoiesis"},
                0));
        questions.add(new Question("Which of the following is not a type of connective tissue fiber?",
                new String[]{"Collagen", "Elastin", "Keratin", "Hyaluronic acid"},
                2));
        questions.add(new Question("What is the name of the hormone that regulates blood calcium levels in the human body?",
                new String[]{"Parathyroid hormone", "Calcitonin", "Thyroid hormone", "Growth hormone"},
                0));
        questions.add(new Question("What is the name of the condition in which the immune system attacks and destroys the insulin-producing cells in the pancreas?",
                new String[]{"Type 1 diabetes", "Type 2 diabetes", "Gestational diabetes", "Hypoglycemia"},
                0));
        questions.add(new Question("What is the name of the process by which proteins are broken down into smaller peptides and amino acids?",
                new String[]{"Proteolysis", "Glycolysis", "Lipolysis", "Photosynthesis"},
                0));

        questions.add(new Question("Which of the following is not a function of the skin?",
                new String[]{"Respiration", "Protection", "Sensation", "Thermoregulation"},
                0));

        questions.add(new Question("What is the name of the hormone that stimulates uterine contractions during childbirth?",
                new String[]{"Oxytocin", "Estrogen", "Progesterone", "Prolactin"},
                0));

        questions.add(new Question("What is the name of the pigment that gives human skin its color?",
                new String[]{"Melanin", "Carotene", "Phytoene", "Anthocyanin"},
                0));

        questions.add(new Question("What is the name of the condition in which the eyes do not align properly and cannot work together?",
                new String[]{"Strabismus", "Astigmatism", "Myopia", "Hyperopia"},
                0));

        questions.add(new Question("Which of the following is not a type of sensory receptor in the human body?",
                new String[]{"Thermoreceptor", "Chemoreceptor", "Photoreceptor", "Myoreceptor"},
                3));

        questions.add(new Question("What is the name of the hormone that regulates the body's metabolism?",
                new String[]{"Thyroid hormone", "Adrenaline", "Insulin", "Growth hormone"},
                0));

        questions.add(new Question("What is the name of the organ that produces insulin and glucagon?",
                new String[]{"Pancreas", "Liver", "Spleen", "Kidney"},
                0));

        questions.add(new Question("What is the name of the process by which white blood cells engulf and destroy bacteria?",
                new String[]{"Phagocytosis", "Pinocytosis", "Exocytosis", "Endocytosis"},
                0));

        questions.add(new Question("Which of the following is not a type of bone in the human body?",
                new String[]{"Spongy bone", "Cortical bone", "Compact bone", "Visceral bone"},
                3));

        questions.add(new Question("What is the name of the hormone that stimulates the development of male secondary sexual characteristics?",
                new String[]{"Testosterone", "Estrogen", "Progesterone", "Androgen"},
                0));

        questions.add(new Question("Which of the following is not a type of cell in the human body?",
                new String[]{"Erythrocyte", "Leukocyte", "Thrombocyte", "Osteocyte"},
                3));

        questions.add(new Question("What is the name of the structure in the eye that regulates the amount of light that enters?",
                new String[]{"Iris", "Pupil", "Lens", "Retina"},
                0));

        questions.add(new Question("What is the name of the hormone that regulates water balance in the human body?",
                new String[]{"Antidiuretic hormone", "Aldosterone", "Insulin", "Growth hormone"},
                0));

        questions.add(new Question("Which of the following is not a type of epithelial tissue in the human body?",
                new String[]{"Squamous epithelium", "Columnar epithelium", "Transitional epithelium", "Connective epithelium"},
                3));

                }

    public Question getRandomQuestion(){
        if (generator == null) return null;
        if (generator.isEmpty()){
            System.out.println("Generator is EMPTY");
            return null;
        }
        Question question = generator.get(new Random().nextInt(generator.size()));
        UserAnswersModule.usedQuestions.add(question);
        generator.remove(question);
        return question;
    }

}
