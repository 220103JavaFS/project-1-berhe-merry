
 function fileValidation() {
                var fileInput =
                    document.getElementById('file');
                
                var filePath = fileInput.value;
            
                // Allowing file type
                var allowedExtensions =
                        /(\.pdf|\.jpg|\.jpeg|\.png|\.gif)$/i;
                
                if (!allowedExtensions.exec(filePath)) {
                    alert('Invalid file type');
                    fileInput.value = '';
                    return false;
                }
                else
                {
                   return true;
                   
                }
            }